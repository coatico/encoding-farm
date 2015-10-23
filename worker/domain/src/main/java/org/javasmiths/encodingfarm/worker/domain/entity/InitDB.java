package org.javasmiths.encodingfarm.worker.domain.entity;

import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Pieter
 */
@Singleton
@Startup
public class InitDB {

    @PersistenceContext()
    private EntityManager em;

    @PostConstruct
    public void init() {
        System.out.println("##########################");
        System.out.println("##########################");
        System.out.println("#####Startup Script#######");
        System.out.println("##########################");
        System.out.println("##########################");

        List<Object> objectsToSave = new LinkedList<>();

        RequestEntity re1 = new RequestEntity();
        re1.setPath("C:/videos/001.mp4");
        objectsToSave.add(re1);

        RequestEntity re2 = new RequestEntity();
        re2.setPath("C:/videos/002.mp4");
        objectsToSave.add(re2);
        
        RequestEntity re3 = new RequestEntity();
        re3.setPath("C:/videos/003.avi");
        objectsToSave.add(re3);

        JobEntity je1 = new JobEntity();
        je1.setRequest(re1);
        je1.setStatus("In Progress");
        objectsToSave.add(je1);

        JobEntity je2 = new JobEntity();
        je2.setRequest(re2);
        je2.setStatus("In Progress");
        objectsToSave.add(je2);
        
        JobEntity je3 = new JobEntity();
        je3.setRequest(re2);
        je3.setStatus("Done");
        objectsToSave.add(je3);
        
        JobEntity je4 = new JobEntity();
        je4.setStatus("Interrupted");
        objectsToSave.add(je4);

        for (Object o : objectsToSave) {
            em.persist(o);
        }
    }
}
