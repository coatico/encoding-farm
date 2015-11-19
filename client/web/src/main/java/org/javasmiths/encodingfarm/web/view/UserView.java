/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.web.view;

import org.javasmiths.encodingfarm.web.facade.UserFacade;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import org.javasmiths.encodingfarm.web.dto.UserDto;

/**
 *
 * @author thomas
 */

@RequestScoped
@Named("users")
public class UserView {
	private List<UserDto> list = new LinkedList<>();
	private String firstName;
	private String lastName;
	private String sex;
	private String birthdate;
	private String password;
	private String username;
	private String email;
	
	@EJB
	private UserFacade facade;
	
	@PostConstruct
	public void init(){
		list = facade.listAll();
	}
	
	public void createUser(ActionEvent actionEvent) {
		facade.createUser(firstName, lastName, sex, birthdate, password, username, email);
                firstName="";
                lastName="";
				sex = "";
				birthdate = "";
				password = "";
				username= "";
				email = "";
		list = facade.listAll();
	}

	public List<UserDto> getList() {
		return list;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSex() {
		return sex;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public UserFacade getFacade() {
		return facade;
	}

	public void setList(List<UserDto> list) {
		this.list = list;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFacade(UserFacade facade) {
		this.facade = facade;
	}
	
	
	
	
}
