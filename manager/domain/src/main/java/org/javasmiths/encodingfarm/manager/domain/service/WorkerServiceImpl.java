/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.service;

import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import org.javasmiths.encodingfarm.manager.domain.dao.WorkerDao;
import org.javasmiths.encodingfarm.manager.domain.entity.WorkerEntity;

/**
 *
 * @author Arne Polfliet
 */
@ManagedBean(name = "workerServiceImpl")
@Stateless
public class WorkerServiceImpl implements WorkerService {

    @EJB
    private WorkerDao dao;
    private WorkerEntity we;
	
	Logger logger = Logger.getLogger("MyLog");  
    FileHandler fh;  

  
	
	private final static String[] picker;
	
	   static {
        picker = new String[2];
        picker[0] = "false";
        picker[1] = "true";
    }

    @Override
    public WorkerEntity registerWorker(String name, Boolean status, String URL) {
		if (name != null && status != null && URL != null) {
        WorkerEntity workerEntity = new WorkerEntity();
        workerEntity.setName(name);
        workerEntity.setStatus(status);
		workerEntity.setURL(URL);
        dao.save(workerEntity);
		}
		

		/*try {
			// This block configure the logger with handler and formatter
			fh = new FileHandler("/tmp/test/MyLogFile.log");
		} catch (IOException ex) {
			Logger.getLogger(WorkerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
		} catch (SecurityException ex) {
			Logger.getLogger(WorkerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
		}
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);  

        // the following statement is used to log any messages  
        logger.info("My first log");  

 

		logger.info("Hi How r u?");
		
		
		*/
		
		
        return null;
    }
	
	public WorkerEntity editWorker(String id, String name, Boolean status, String URL){
		WorkerEntity workerEntity = null;
        
        if(id != null) {
            workerEntity = dao.findById(id);
            
        }
        
        if(workerEntity == null){
            workerEntity = new WorkerEntity();
        }
        /* In WorkerEntity staat dubbele code, met andere benamingen */	
        workerEntity.setName(name);
        workerEntity.setStatus(status);
        workerEntity.setURL(URL);
        dao.update(workerEntity);
        
        return workerEntity;
        
	/* Zie boven voor de refresh
        return "index.xhtml??faces-redirect=true";
                */
	}

    @Override
    public WorkerEntity deleteWorker(String id) {
        dao.delete(id);
        return null;
    }

    @Override
    public WorkerEntity disableWorker(String name) {
        we.setStatus(false);
        return we;

    }
    @Override
    public WorkerEntity enableWorker(String name) {
        we.setStatus(true);
        return we;

    }

    @Override
    public List<WorkerEntity> listAll() {
        return dao.listAll();
    }

	public static String[] getPicker() {
		return picker;
	}
}
