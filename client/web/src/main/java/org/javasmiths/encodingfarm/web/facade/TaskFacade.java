/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.javasmiths.encodingfarm.web.facade;

import java.util.List;
import org.javasmiths.encodingfarm.web.dto.TaskDto;


public interface TaskFacade {
	public void createTask(String title, String filePath, String description);
	
	public List<TaskDto> listAll();

	public void deleteTask(String id);
}
