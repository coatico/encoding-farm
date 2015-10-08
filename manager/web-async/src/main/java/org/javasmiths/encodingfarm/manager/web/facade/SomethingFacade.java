/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.web.facade;

import java.util.List;
import org.javasmiths.encodingfarm.manager.web.dto.SomethingDto;

/**
 *
 * @author thomas
 */
public interface SomethingFacade {

	public void create(String name);

	public List<SomethingDto> listAll();
	
}
