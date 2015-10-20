/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.javasmiths.encodingfarm.common.domain.entity.BaseTrackableEntity;

/**
 *
 * @author H
 */
@Entity
@Table(name = "VIDEOS")
public class VideoEntity extends BaseTrackableEntity implements Serializable {

    @Column(name = "videoCode")
    @Type(type = "text")
    private String videoCode;
    @Column(name = "VideoTitle")
    @Type(type = "text")
    private String VideoTitle;
    @Column(name = "videoLink")
    @Type(type = "text")
    private String videoLink;
    @Column(name = "videoDescription")
    @Type(type = "text")
    private String videoDescription;

    public String getVideoCode() {
        return videoCode;
    }

    public void setVideoCode(String videoCode) {
        this.videoCode = videoCode;
    }

    public String getVideoTitle() {
        return VideoTitle;
    }

    public void setVideoTitle(String VideoTitle) {
        this.VideoTitle = VideoTitle;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public String getVideoDescription() {
        return videoDescription;
    }

    public void setVideoDescription(String videoDescription) {
        this.videoDescription = videoDescription;
    }

}
