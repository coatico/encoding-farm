/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.worker.web.facade;

import java.util.List;
import org.javasmiths.encodingfarm.worker.web.dto.RequestDto;

/**
 *
 * @author Quintendockx
 */
public interface RequestFacade {

    public void create(String path);

    public List<RequestDto> listAll();
    
    public void remove(String id);
}
