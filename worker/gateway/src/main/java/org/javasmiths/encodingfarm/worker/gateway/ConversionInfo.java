/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.worker.gateway;

import org.javasmiths.encodingfarm.worker.domain.entity.RequestEntity;

/**
 *
 * @author peeters.joris
 */
public class ConversionInfo {
    
    public String uuid; 
    public RequestEntity entity;
    public String sourceFile;
    public String outputFile;
    public String subtitleFile;

    public ConversionInfo(RequestEntity entity) {
        this.entity = entity;
    }

    public RequestEntity getEntity() {
        return entity;
    }

    public void setEntity(RequestEntity entity) {
        this.entity = entity;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    public String getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(String outputFile) {
        this.outputFile = outputFile;
    }

    public String getSubtitleFile() {
        return subtitleFile;
    }

    public void setSubtitleFile(String subtitleFile) {
        this.subtitleFile = subtitleFile;
    }
    
    
}
