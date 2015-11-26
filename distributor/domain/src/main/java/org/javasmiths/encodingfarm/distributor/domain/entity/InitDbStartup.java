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
        videoEntity.setVideopath("Videos/1.mp4");
        videoEntity.setThumbnail("Thumbnails/2.jpg");
        videoEntity.setDescription("this is a description");
        objectsToSave.add(videoEntity);
        
        VideoEntity videoEntity1 = new VideoEntity();
        videoEntity1.setName("test2");
        videoEntity1.setVideopath("Videos/2.mp4");
        videoEntity1.setThumbnail("Thumbnails/1.jpg");
        videoEntity1.setDescription("this is a second description");
        objectsToSave.add(videoEntity1);
        
        VideoEntity videoEntity2 = new VideoEntity();
        videoEntity2.setName("Lama");
        videoEntity2.setVideopath("Videos/testVid.mp4");
        videoEntity2.setThumbnail("Thumbnails/1.jpg");
        videoEntity2.setDescription("A video of a lama happily jumping around");
        objectsToSave.add(videoEntity2);
        
        for (Object objectsToSave1 : objectsToSave){
            em.persist(objectsToSave1);
        }
    }
}
