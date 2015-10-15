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
public interface JobFacade {
    
    
      public void create(String name);

	public List<RequestDto> listAll();
}
