/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.worker.gateway;

/**
 *
 * @author peeters.joris
 */
public class ConversionResult {
    public Status status;
    public String message;
    public Double progress;
    public ConversionInfo info;
   
    public ConversionResult(Status status, String message, Double progress) {
        this.status = status;
        this.message = message;
        this.progress = progress;
    }

    public ConversionResult() {
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public ConversionInfo getInfo() {
        return info;
    }

    public void setInfo(ConversionInfo info) {
        this.info = info;
    }
   
    @Override
    public String toString() {
        return "ConversionResult{" + "status=" + status + ", message=" + message + ", progress=" + progress + '}';
    }
}
