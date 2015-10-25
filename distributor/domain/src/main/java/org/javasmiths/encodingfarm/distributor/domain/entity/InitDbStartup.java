package org.javasmiths.encodingfarm.distributor.domain.entity;

import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@Singleton
@Startup
public class InitDbStartup {

    @PersistenceContext(unitName = "encoding_distributor")
    private EntityManager em;

    @GET
    @Produces({"application/json", "application/xml"})
    @PostConstruct
    public void init() {
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++Start Up Script+++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        List < Object > objectsToSave = new LinkedList<>();
        
        VideoEntity videoEntity = new VideoEntity();
        videoEntity.setName("test");
        videoEntity.setVideopath("Videos/test");
        videoEntity.setThumbnail("Thumbnails/test");
        videoEntity.setDescription("this is a description");
        objectsToSave.add(videoEntity);
        
        VideoEntity videoEntity1 = new VideoEntity();
        videoEntity1.setName("test2");
        videoEntity1.setVideopath("Videos/test2");
        videoEntity1.setThumbnail("Thumbnails/test2");
        videoEntity1.setDescription("this is a second description");
        objectsToSave.add(videoEntity1);
        
        for (Object objectsToSave1 : objectsToSave){
            em.persist(objectsToSave1);
        }
    }
}
