/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.sample.domain.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.javasmiths.encodingfarm.common.domain.dao.BaseDaoImpl;
import org.javasmiths.encodingfarm.sample.domain.entity.LocationEntity;

/**
 *
 * @author thomas
 */
@Stateless
public class LocationDaoImpl extends BaseDaoImpl<LocationEntity> implements LocationDao{

	@PersistenceContext(unitName = "samplePU")
	protected EntityManager em;
	
	
	@Override
	protected EntityManager em() {
		return em;
	}

	@Override
	protected Class<LocationEntity> entityClass() {
		return LocationEntity.class;
	}
    

}
