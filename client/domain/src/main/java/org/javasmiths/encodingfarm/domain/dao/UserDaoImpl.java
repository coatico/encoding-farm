/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.domain.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.javasmiths.encodingfarm.common.domain.dao.BaseDaoImpl;
import org.javasmiths.encodingfarm.domain.entity.UserEntity;

/**
 *
 * @author thomas
 */
@Stateless
public class UserDaoImpl extends BaseDaoImpl<UserEntity> implements UserDao {

	@PersistenceContext(unitName = "clientPU")
	protected EntityManager em;

	@Override
	protected EntityManager em() {
		return em;
	}

	@Override
	protected Class<UserEntity> entityClass() {
		return UserEntity.class;
	}

	@Override
	public void delete(String id) {
		UserEntity user = em.getReference(UserEntity.class, id);
		em.remove(user);
		em.flush();
	}

	
	//update nog toeveogen, is al voorgeprogrammeerd in de userDAO
	

}
