/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.web.facade;

import java.util.Date;
import java.util.List;
import org.javasmiths.encodingfarm.manager.web.dto.JobDto;

/**
 *
 * @author thomas
 */
public interface JobFacade {

	public void create(String jobTitle, Date creationdate, String workerID, String videoID );
        
        public void delete(String id);
        
        public void update(String id, String title, Date creationdate, String workerID, String videoID);

	public List<JobDto> listAll();
	
}
