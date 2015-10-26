/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.distributor.domain.service;

import java.util.List;
import org.javasmiths.encodingfarm.distributor.domain.entity.VideoEntity;

/**
 *
 * @author thomas
 */
public interface VideoService {

	VideoEntity registerVideo(String name);

	List<VideoEntity> listAll();

	public void remove(String id);

	public void update(String id);
}
