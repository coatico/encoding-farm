/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.web.facade;

import java.util.List;
import org.javasmiths.encodingfarm.manager.web.dto.WorkerDto;

/**
 *
 * @author Alexander Hermans
 */
public interface WorkerFacade {
    
	public void create(String workerName);

    public void delete(String id);

    public void update(String id, String title);

    public List<WorkerDto> listAll();
	
}
