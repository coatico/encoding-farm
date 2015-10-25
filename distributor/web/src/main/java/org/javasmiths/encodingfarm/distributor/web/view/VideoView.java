package org.javasmiths.encodingfarm.distributor.web.view;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import org.javasmiths.encodingfarm.distributor.web.dto.VideoDto;
import org.javasmiths.encodingfarm.distributor.web.facade.VideoFacade;

@RequestScoped
@Named("video")
public class VideoView {

    private String name;
    private String path;
    private String thumbnail;
    private String description;
    
    private List<VideoDto> list = new LinkedList<>();

    @EJB
    private VideoFacade facade;

    @PostConstruct
    public void init() {
        list = facade.listAll();
    }
	
	public void remove(String id) {
		facade.remove(id);
		list = facade.listAll();
	}

    public void create(ActionEvent actionEvent) {
        facade.create(name, path, thumbnail, description);
        list = facade.listAll();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<VideoDto> getList() {
        return list;
    }

    public void setList(List<VideoDto> list) {
        this.list = list;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    

}
