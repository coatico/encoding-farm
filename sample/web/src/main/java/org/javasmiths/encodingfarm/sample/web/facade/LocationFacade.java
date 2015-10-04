/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.sample.web.facade;

import java.util.List;
import org.javasmiths.encodingfarm.sample.web.dto.LocationDto;

/**
 *
 * @author thomas
 */
public interface LocationFacade {

	public void create(String name);

	public List<LocationDto> listAll();
	
}
