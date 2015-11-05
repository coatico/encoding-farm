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

	@Override
	public void update(String id, String firstName, String lastName, String sex, String birthdate, String password, String username, String email) {
		UserEntity user = em.getReference(UserEntity.class, id);
		user.getUserEntity().setFirstName(firstName);
		user.getUserEntity().setLastName(lastName);
		user.getUserEntity().setSex(sex);
		user.getUserEntity().setBirthdate(birthdate);
		user.getUserEntity().setPassword(password);
		user.getUserEntity().setUsername(username);
		user.getUserEntity().setEmail(email);
		em.flush();
	}

}
