/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.web.dto;

/**
 *
 * @author Alexander Hermans
 */
public class WorkerDto {

    private String id;
    private String workerName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

}
