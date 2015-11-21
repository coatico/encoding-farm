///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package org.javasmiths.encodingfarm.manager.domain.entity;
//
//import java.util.LinkedList;
//import java.util.List;
//import javax.annotation.PostConstruct;
//import javax.ejb.Singleton;
//import javax.ejb.Startup;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
///**
// *
// * @author TmoT
// */
//@Singleton
//@Startup
//public class InitDBWebAdmin {
//    
//    @PersistenceContext(unitName = "managerPU")
//    private EntityManager em;
//    
//    @PostConstruct
//    public void init() {
//        System.out.println("***************************************************************************");
//        System.out.println("*****************************Startup Script********************************");
//        System.out.println("*********Onderstaande standaardwaarden worden aan DB toegevoegd************");
//        System.out.println("***************************************************************************");
//    
//        List<Object> objectsToSave = new LinkedList<>();
//        
//        WorkerEntity workerEntity1 = new WorkerEntity();
//        workerEntity1.setName("Werker 1");
//        workerEntity1.setStatus(true);
//        workerEntity1.setURL("http://www.google.be");
//        objectsToSave.add(workerEntity1);
//        
//        WorkerEntity workerEntity2 = new WorkerEntity();
//        workerEntity2.setName("Werker 2");
//        workerEntity2.setStatus(false);
//        workerEntity2.setURL("http://www.dalcon.be");
//        objectsToSave.add(workerEntity2);
//        
//        WorkerEntity workerEntity3 = new WorkerEntity();
//        workerEntity3.setName("Werker 3");
//        workerEntity3.setStatus(true);
//        workerEntity3.setURL("http://www.test.be");
//        objectsToSave.add(workerEntity3);
//        
//        for (Object objectToSave1 : objectsToSave) {
//            em.persist(objectToSave1);
//        }
//    }
//}
