/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.domain.dao;

import java.util.List;
import org.javasmiths.encodingfarm.domain.entity.UserEntity;

public interface UserDao {

	public void save(UserEntity userEntity);

	public List<UserEntity> listAll();

	public void delete(String id);
	
	//public void update( String firstName,String lastName,String sex, String birthdate, String password,String username,String email);
}
