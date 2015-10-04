/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.sample.domain.service;

import java.util.List;
import org.javasmiths.encodingfarm.sample.domain.entity.LocationEntity;

/**
 *
 * @author thomas
 */
public interface LocationService {
    
    LocationEntity registerLocation(String name);
	
	List<LocationEntity> listAll();
}
