/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.entity;

/**
 *
 * @author Arne
 */
import java.util.UUID;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BasicEntity {

    @Id
    private String id = UUID.randomUUID().toString();
    private String workerID = UUID.randomUUID().toString();
    private String videoID = UUID.randomUUID().toString();

    public String getWorkerID() {
        return workerID;
    }

    public void setWorkerID(String workerID) {
        this.workerID = workerID;
    }

    public String getVideoID() {
        return videoID;
    }

    public void setVideoID(String videoID) {
        this.videoID = videoID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
