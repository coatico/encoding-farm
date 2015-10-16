/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.worker.web.facade;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.worker.domain.entity.RequestEntity;
import org.javasmiths.encodingfarm.worker.domain.service.RequestService;
import org.javasmiths.encodingfarm.worker.web.dto.RequestDto;




/**
 *
 * @author Quintendockx
 */
@Stateless
public class RequestFacadeImpl implements RequestFacade{ 

    @EJB
	private RequestService requestService;
	
	@Override
	public void create(String name) {
		requestService.registerRequest(name);
	}

	@Override
	public List<RequestDto> listAll() {
		List<RequestDto> dtos = new LinkedList<>();
		List<RequestEntity> requestsE =  requestService.listAll();
		for (RequestEntity request : requestsE) {
			RequestDto dto = new RequestDto();
			dto.setId(request.getId());
			dto.setVideo_path(request.getVideo_path());
			dtos.add(dto);
		}
		return dtos;
	}
	
}
