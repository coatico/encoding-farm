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

/**
 *
 * @author thomas
 */
@RequestScoped
@Named("video")
public class VideoView {

    private String name;
    private List<VideoDto> list = new LinkedList<>();

    @EJB
    private VideoFacade facade;

    @PostConstruct
    public void init() {
        list = facade.listAll();
    }

    public void create(ActionEvent actionEvent) {
        facade.create(name);
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

}
