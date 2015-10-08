/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.service;

import java.util.List;
import org.javasmiths.encodingfarm.manager.domain.entity.SomethingEntity;

/**
 *
 * @author Elias Serneels
 */
public interface SomethingService {
    SomethingEntity registerSomething(String name);
	
	List<SomethingEntity> listAll();
}
