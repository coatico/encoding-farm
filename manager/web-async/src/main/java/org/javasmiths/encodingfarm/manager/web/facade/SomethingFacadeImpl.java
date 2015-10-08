/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.web.facade;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.manager.domain.entity.SomethingEntity;
import org.javasmiths.encodingfarm.manager.domain.service.SomethingService;
import org.javasmiths.encodingfarm.manager.web.dto.SomethingDto;

/**
 *
 * @author thomas
 */
@Stateless
public class SomethingFacadeImpl implements SomethingFacade{

	@EJB
	private SomethingService somethingService;
	
	@Override
	public void create(String name) {
		somethingService.registerSomething(name);
	}

	@Override
	public List<SomethingDto> listAll() {
		List<SomethingDto> dtos = new LinkedList<>();
		List<SomethingEntity> locationsE =  somethingService.listAll();
		for (SomethingEntity location : locationsE) {
			SomethingDto dto = new SomethingDto();
			dto.setId(location.getId());
			dto.setName(location.getName());
			dtos.add(dto);
		}
		return dtos;
	}
	
	
	
}
