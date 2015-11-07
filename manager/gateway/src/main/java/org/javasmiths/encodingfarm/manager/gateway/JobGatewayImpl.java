/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.gateway;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.json.stream.JsonGenerationException;
import org.javasmiths.encodingfarm.manager.domain.entity.JobEntity;
import org.json.JSONObject;

/**
 *
 * @author Elias Serneels
 */
public class JobGatewayImpl implements JobGateway {

    @Override
    public void convert(JobEntity job) {
        
    }
    
    @PostConstruct
    public static void main(String[] args) {
        String string = "";
        try {
//                        // MANIER 1
//			// temp JSON inputfile
//                        // inlezen
//			InputStream inputStream = new FileInputStream("src\\main\\resources\\testJSON.json");
//			InputStreamReader inputReader = new InputStreamReader(inputStream);
//			BufferedReader br = new BufferedReader(inputReader);
//			String line;
//			while ((line = br.readLine()) != null) {
//				string += line + "\n";
//			}
//                        //JSONObject van maken
//			JSONObject jsonObject = new JSONObject(string);
//			System.out.println(jsonObject);
// 
//			// JSON file naar REST overzetten: heeft POST controller nodig
//                        // WERKT MOMENTEEL DUS NIET MAAR HEBBEN WE OOK NOG NIET NODIG
//			try {
//				URL url = new URL("http://localhost:8080/web-async/index.xhtml/rest/jobs/");
//				URLConnection connection = url.openConnection();
//				connection.setDoOutput(true);
//				connection.setRequestProperty("Content-Type", "application/json");
//				connection.setConnectTimeout(5000);
//				connection.setReadTimeout(5000);
//				OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
//				out.write(jsonObject.toString());
//				out.close();
// 
//				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
// 
//				while (in.readLine() != null) {
//				}
//				System.out.println("\n REST Service Invoked Successfully..");
//				in.close();
//			} catch (Exception e) {
//				System.out.println("\nError while calling REST Service");
//				System.out.println(e);
//			}
                        // MANIER 2
                        ObjectMapper mapper = new ObjectMapper();
                        try {
                        
			// JSON file die werd ingelezen omzetten in een JobEntity, werkt niet voor lists
//			JobEntity job = mapper.readValue(new File("src\\main\\resources\\testJSON.json"), JobEntity.class);
//			System.out.println(job.getJobTitle());
                        
                        //JSON file met lijst van objecten inlezen en omzetten in lijst van entities
                        List<JobEntity> jobs = mapper.readValue(new File("src\\main\\resources\\testJSON.json"), new TypeReference<List<JobEntity>> () {});
                        System.out.println(jobs.get(1).getJobTitle());
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

 
//			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    }

