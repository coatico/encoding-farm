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
        re1.setVideo_path("C:/videos/001.mp4");
        objectsToSave.add(re1);
        
        RequestEntity re2 = new RequestEntity();
        re2.setVideo_path("C:/videos/002.mp4");
        objectsToSave.add(re2);
        
        JobEntity je1 = new JobEntity();
        je1.setRequest(re1);
        je1.setStatus("In Progress");
        objectsToSave.add(je1);
        
        JobEntity je2 = new JobEntity();
        je2.setRequest(re2);
        je2.setStatus("In Progress");
        objectsToSave.add(je2);
        
        for(Object o: objectsToSave) {
            em.persist(o);
        }
    }
}
