/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.distributor.web.facade;

import java.util.List;
import org.javasmiths.encodingfarm.distributor.web.dto.VideoDto;

/**
 *
 * @author thomas
 */
public interface VideoFacade {

	public void create(String name);

	public List<VideoDto> listAll();
	
}
