/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.sample.web.facade;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.sample.domain.entity.LocationEntity;
import org.javasmiths.encodingfarm.sample.domain.service.LocationService;
import org.javasmiths.encodingfarm.sample.web.dto.LocationDto;

/**
 *
 * @author thomas
 */
@Stateless
public class LocationFacadeImpl implements LocationFacade{

	@EJB
	private LocationService locationService;
	
	@Override
	public void create(String name) {
		locationService.registerLocation(name);
	}

	@Override
	public List<LocationDto> listAll() {
		List<LocationDto> dtos = new LinkedList<>();
		List<LocationEntity> locationsE =  locationService.listAll();
		for (LocationEntity location : locationsE) {
			LocationDto dto = new LocationDto();
			dto.setId(location.getId());
			dto.setName(location.getName());
			dtos.add(dto);
		}
		return dtos;
	}
	
	
	
}
