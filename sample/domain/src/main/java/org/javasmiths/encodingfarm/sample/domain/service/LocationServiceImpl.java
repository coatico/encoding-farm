/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.sample.domain.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.sample.domain.dao.LocationDao;
import org.javasmiths.encodingfarm.sample.domain.entity.LocationEntity;

/**
 *
 * @author thomas
 */
@Stateless
public class LocationServiceImpl implements LocationService{

    @EJB
    private LocationDao dao;
    
    @Override
    public LocationEntity registerLocation(String name) {
       LocationEntity locationEntity = new LocationEntity();
       locationEntity.setName(name);
       dao.save(locationEntity);
       return locationEntity;
    }

	@Override
	public List<LocationEntity> listAll() {
		return dao.listAll();
	}
	
	
    
    
}
