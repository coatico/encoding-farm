package org.javasmiths.encodingfarm.manager.domain.dao;


import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.javasmiths.encodingfarm.common.domain.dao.BaseDaoImpl;
import org.javasmiths.encodingfarm.manager.domain.entity.JobEntity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elias Serneels
 */
@Stateless
public class JobDaoImpl extends BaseDaoImpl<JobEntity> implements JobDao{

	@PersistenceContext(unitName = "samplePU")
	protected EntityManager em;
	
	
	@Override
	protected EntityManager em() {
		return em;
	}

	@Override
	protected Class<JobEntity> entityClass() {
		return JobEntity.class;
	}
    

}
