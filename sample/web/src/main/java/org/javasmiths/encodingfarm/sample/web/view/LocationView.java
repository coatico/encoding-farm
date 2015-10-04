package org.javasmiths.encodingfarm.sample.web.view;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import org.javasmiths.encodingfarm.sample.web.dto.LocationDto;
import org.javasmiths.encodingfarm.sample.web.facade.LocationFacade;

/**
 *
 * @author thomas
 */
@RequestScoped
@Named("location")
public class LocationView {

	private String name;
	private List<LocationDto> list = new LinkedList<>();
		
	@EJB
	private LocationFacade facade;
	

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

	public List<LocationDto> getList() {
		return list;
	}

	public void setList(List<LocationDto> list) {
		this.list = list;
	}
	
}
