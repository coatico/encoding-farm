/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.javasmiths.encodingfarm.web.facade;

import java.util.List;
import org.javasmiths.encodingfarm.web.dto.UserDto;


public interface UserFacade {
	public void createUser(String firstName, String lastName, String sex, String birthdate, String password, String username, String email);
	
	public List<UserDto> listAll();

	public void deleteUser(String id);

	public void updateUser(String id,String firstName, String lastName, String sex, String birthdate, String password, String username, String email);
}
