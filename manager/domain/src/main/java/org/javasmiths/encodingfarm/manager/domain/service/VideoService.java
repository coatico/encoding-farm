/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.service;

import java.util.List;
import org.javasmiths.encodingfarm.manager.domain.entity.VideoEntity;

/**
 *
 * @author Alexander Hermans
 */
public interface VideoService {

    VideoEntity registerVideo(String videoTitle, String videoLink, String videoCode, String videoDescription);

    VideoEntity deleteVideo(String id);

    VideoEntity updateVideo(String id, String videoTitle, String videoLink, String videoCode, String videoDescription);

    List<VideoEntity> listAll();
}
