/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.manager.domain.entity.SomethingEntity;
import org.javasmiths.encodingfarm.manager.domain.dao.SomethingDao;

/**
 *
 * @author Elias Serneels
 */
@Stateless
public class SomethingServiceImpl implements SomethingService{
    
    @EJB
    private SomethingDao dao;
    
    @Override
    public SomethingEntity registerSomething(String name) {
       SomethingEntity somethingEntity = new SomethingEntity();
       somethingEntity.setName(name);
       dao.save(somethingEntity);
       return somethingEntity;
    }

	@Override
	public List<SomethingEntity> listAll() {
		return dao.listAll();
	}
    
}
