/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.javasmiths.encodingfarm.domain.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.domain.dao.UserDao;


import org.javasmiths.encodingfarm.domain.entity.UserEntity;

@Stateless
public class UserServiceImpl implements UserService {
	@EJB
	private UserDao userDao;
	


	@Override
	public UserEntity registerUser(String firstName,String lastName,String sex, String birthdate, String password,String username,String email) {
		UserEntity userEntity = new UserEntity();
		save(userEntity);
                return userEntity;
	}

	private void save(UserEntity userEntity) {
            userDao.save(userEntity);
           
	}
	
	@Override
	public List<UserEntity> listAll() {
		return userDao.listAll();
	}
	
	@Override
	public void deleteUser(String id) {
		userDao.delete(id);
	}

	@Override
	public void updateUser(String id,String firstName,String lastName,String sex, String birthdate, String password,String username,String email) {
		userDao.update(id,firstName,lastName,sex, birthdate, password,username,email);
	}
	
	
}
