/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author H
 */
@Singleton
@Startup
public class InitDB {

    @PersistenceContext(unitName = "managerPU")
    private EntityManager em;
    List<Object> objectsToSaveList = new LinkedList<>();

    @PostConstruct
    public void init() {
        WorkerEntity we1 = new WorkerEntity();
        we1.setWorkerName("Mr Worker 1");
        objectsToSaveList.add(we1);
        System.out.println("Added :"+we1.getWorkerName());

        WorkerEntity we2 = new WorkerEntity();
        we2.setWorkerName("Mr Worker 2");
        objectsToSaveList.add(we2);
        System.out.println("Added :"+we2.getWorkerName());

        JobEntity je1 = new JobEntity();
        je1.setJobWorker(we1);
        try {
            je1.setJobCreationDateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2015-10-28 11:11:00"));
        } catch (ParseException ex) {
            Logger.getLogger(InitDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            je1.setJobCompletionDateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2015-10-28 12:12:00"));
        } catch (ParseException ex) {
            Logger.getLogger(InitDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        je1.setJobTitle("test job 1");
        objectsToSaveList.add(je1);

        JobEntity je2 = new JobEntity();
        je2.setJobWorker(we2);
        try {
            je2.setJobCreationDateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2015-10-29 11:11:00"));
        } catch (ParseException ex) {
            Logger.getLogger(InitDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            je2.setJobCompletionDateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2015-10-29 12:12:00"));
        } catch (ParseException ex) {
            Logger.getLogger(InitDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        je2.setJobTitle("test job 2");
        objectsToSaveList.add(je2);

        for (Object objectsToSaveList : objectsToSaveList) {
            em.persist(objectsToSaveList);
        }
    }
}
