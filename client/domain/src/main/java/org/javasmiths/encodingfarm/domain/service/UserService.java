/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.domain.service;

import java.util.List;
import org.javasmiths.encodingfarm.domain.entity.UserEntity;


public interface UserService {

	public UserEntity registerUser(String firstName,String lastName,String sex, String birthdate, String password,String username,String email);

	public List<UserEntity> listAll();

	public void deleteUser(String id);

	public void updateUser(String id,String firstName,String lastName,String sex, String birthdate, String password,String username,String email);
		
}
