/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.web.facade;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import org.javasmiths.encodingfarm.domain.entity.UserEntity;
import org.javasmiths.encodingfarm.domain.service.UserService;
import org.javasmiths.encodingfarm.web.dto.UserDto;

/**
 *
 * @author thomas
 */
public class UserFacadeImpl implements UserFacade{
	
	@EJB
	private UserService userService;

	@Override
	public void createUser(String firstName, String lastName, String sex, String birthdate, String password, String username, String email) {
		userService.registerUser(firstName, lastName, sex, birthdate, password, username, email);
	}
	
	@Override
	public List<UserDto> listAll() {
		List<UserDto> dtos = new LinkedList<>();
		List<UserEntity> users =  userService.listAll();
		for (UserEntity user : users) {
			UserDto dto = new UserDto();
			//dto.setId(user.getId());
			dto.setFirstName(user.getFirstName());
			dto.setLastName(user.getLastName());
			dto.setEmail(user.getEmail());
			dto.setSex(user.getSex());
			dto.setPassword(user.getPassword());
			dto.setBirthdate(user.getBirthdate());
			dto.setUsername(user.getUsername());
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	public void deleteUser(String id) {
		userService.deleteUser(id);
	}

	@Override
	public void updateUser(String id,String firstName, String lastName, String sex, String birthdate, String password, String username, String email) {
		userService.updateUser(id, firstName, lastName, sex, birthdate, password, username, email);
	}
}
