/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.worker.web.facade;

import java.util.List;
import org.javasmiths.encodingfarm.worker.web.dto.WorkerDto;

/**
 *
 * @author Elliot
 */
public interface WorkerFacade {
    public void create(String path);

    public List<WorkerDto> listAll();
    
    public void remove(String id);
    
    public void update(WorkerDto dto);
}