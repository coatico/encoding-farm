package org.javasmiths.encodingfarm.manager.web.view;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import org.javasmiths.encodingfarm.manager.web.dto.SomethingDto;
import org.javasmiths.encodingfarm.manager.web.facade.SomethingFacade;

/**
 *
 * @author thomas
 */
@RequestScoped
@Named("location")
public class SomethingView {

	private String name;
	private List<SomethingDto> list = new LinkedList<>();
		
	@EJB
	private SomethingFacade facade;
	

	@PostConstruct
	public void init(){
		list = facade.listAll();
	}
	
	public void create(ActionEvent actionEvent){
		facade.create(name);
		list = facade.listAll();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SomethingDto> getList() {
		return list;
	}

	public void setList(List<SomethingDto> list) {
		this.list = list;
	}
	
}
