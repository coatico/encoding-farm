/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.webadmin.facade;

import java.util.List;
import org.javasmiths.encodingfarm.manager.webadmin.model.WorkerListDetailDto;


/**
 *
 * @author Arne
 */





public interface WorkerFacade {

	public void create(String name);

	public List<WorkerListDetailDto> listAll();
	
}