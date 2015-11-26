/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.worker.gateway;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Observable;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import org.javasmiths.encodingfarm.worker.domain.entity.RequestEntity;
import org.javasmiths.encodingfarm.worker.domain.service.JobService;

/**
 *
 * @author joris
 */
public class VideoConverterGatewayImpl extends Observable implements VideoConverterGateway {

    @EJB
    private JobService jobService;
    
    private final Boolean printDebug = false;
    private final String working = "../lib/";
    private final String input = "video.mp4";
    private final String output = "samson";
    private final String sub = "test.srt";
    private String ffmpeg = working + "ffmpeg.exe";

    @Override
    public void convert(RequestEntity request) {
        DateFormat parseFormat = new SimpleDateFormat("HH:mm:ss.SS");

        setOSDependantFFmpeg();

        ConversionInfo info = createConversionInfo(request);
        
        try {
            ProcessBuilder pb = getProcessBuilder();
            Process proc = pb.start();
            try (BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getErrorStream()))) {
                Boolean parseResult = parseOutput(stdInput, parseFormat, info);
                if(parseResult) {
                    print("DONE", false);
                    updateProgress(info, Status.COMPLETED);
                    return;
                }
            } catch (ParseException ex) {
                Logger.getLogger(VideoConverterGatewayImpl.class.getName()).log(Level.SEVERE, null, ex);
                updateProgress(info, Status.ERROR, ex.getMessage());
            }
            proc.waitFor();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(VideoConverterGatewayImpl.class.getName()).log(Level.SEVERE, null, ex);
            updateProgress(info, Status.ERROR, ex.getMessage());
        }
        updateProgress(null, Status.UNKNOWN);

    }

    private Boolean parseOutput(final BufferedReader stdInput, DateFormat parseFormat, ConversionInfo info) throws IOException, ParseException {
        String line = null;
        String movieDuration = null;
        while ((line = stdInput.readLine()) != null) {
            if (line.contains("No such file or directory")){
                updateProgress(info, Status.ERROR, line);
                return false;
            }
            if (line.contains("Duration:")) {
                String[] duration = line.split("Duration=");
                movieDuration = duration[0].split(", start:")[0].split("Duration:")[1];
                print("TIJD IS " + movieDuration);
            }
            if (line.startsWith("frame=")) {
                String progress = line.split("time=")[1].split(" bitrate=")[0];
                // System.out.println(progress.trim() + " /" + (movieDuration == null ? "hh:mm:ss.ff": movieDuration.trim()));
                Date progressTime = parseFormat.parse(progress);
                Date totalTime = parseFormat.parse(movieDuration);
                double calculatedProgress = round((100.0 / getTime(totalTime)) * getTime(progressTime), 2);
                print(calculatedProgress + "%");
                updateProgress(info, Status.INPROGRESS, calculatedProgress);
            }
            print(line);
        }
        return true;
    }
    
    public ConversionInfo createConversionInfo(RequestEntity request){
        ConversionInfo info =  new ConversionInfo(request);
        info.uuid = UUID.randomUUID().toString(); 
        return info;
    }

    public void updateProgress(ConversionInfo conversionInfo, Status status) {
       updateProgress(conversionInfo, status, "", 0.0);
    }

    public void updateProgress(ConversionInfo conversionInfo, Status status, Double progress) {
       updateProgress(conversionInfo, status, "", progress);
    }

    public void updateProgress(ConversionInfo conversionInfo, Status status, String message) {
       updateProgress(conversionInfo, status, message, 0.0);
    }

    public void updateProgress(ConversionInfo conversionInfo, Status status, String message, Double progress) {
        setChanged();
        ConversionResult result = createConversionResult(conversionInfo, status, message);
        result.progress = progress;
        notifyObservers(result);
    }
    
    public ConversionResult createConversionResult(ConversionInfo conversionInfo, Status status){
        return createConversionResult(conversionInfo, status, null);
    }
    
    public ConversionResult createConversionResult(ConversionInfo conversionInfo, Status status, String message){
        ConversionResult result = new ConversionResult();
        result.status = status;
        result.info = conversionInfo;
        result.message = message;
        return result;
    }

    public void setOSDependantFFmpeg() {
        if (System.getProperty("os.name").startsWith("Mac")) {
            ffmpeg = working + "ffmpeg";
        }
    }

    public ProcessBuilder getProcessBuilder() throws IOException {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        Date date = new Date();
        File ffmpegFile = new File(ffmpeg);
        /*File inputFile = new File(input);
         File outputFile = new File(output + dateFormat.format(date) + ".avi");
         File subFile = new File(sub);*/
        String outputFile = output + dateFormat.format(date) + ".avi";
        String[] args = new String[]{ffmpegFile.getCanonicalPath(), "-i", input, (sub.length() > 0) ? "-vf" : "", (sub.length() > 0) ? "subtitles=" + sub + "" : "", outputFile};
        ProcessBuilder pb = new ProcessBuilder(args);
        pb.directory(new File(working));
        pb.redirectOutput();
        pb.redirectError();
        return pb;
    }

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    private Double getTime(Date date) {
        Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
        calendar.setTime(date);
        long millisec = calendar.get(Calendar.MILLISECOND);
        long sec = calendar.get(Calendar.SECOND);
        long min = calendar.get(Calendar.MINUTE);
        long hour = calendar.get(Calendar.HOUR);
        double t = millisec
                + sec * 100.0
                + min * 6000.0
                + hour * 360000.0;
        return t;
    }

    private void print(String message, Boolean print) {
        if (!print) {
            return;
        }
        System.out.println(message);
    }

    private void print(String message) {
        print(message, printDebug);
    }
}
