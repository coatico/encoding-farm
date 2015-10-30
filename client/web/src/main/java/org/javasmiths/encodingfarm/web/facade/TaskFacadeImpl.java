/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.javasmiths.encodingfarm.web.facade;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.domain.service.TaskService;
import org.javasmiths.encodingfarm.domain.entity.TaskEntity;
import org.javasmiths.encodingfarm.web.dto.FileDto;
import org.javasmiths.encodingfarm.web.dto.TaskDto;

@Stateless
public class TaskFacadeImpl implements TaskFacade {
	
	@EJB
	private TaskService taskService;

	@Override
	public void createTask(String title, String filePath, String description) {
		taskService.registerTask(title, filePath, description);
	}
	
	@Override
	public List<TaskDto> listAll() {
		List<TaskDto> dtos = new LinkedList<>();
		List<TaskEntity> tasks =  taskService.listAll();
		for (TaskEntity task : tasks) {
			TaskDto dto = new TaskDto();
			dto.setId(task.getId());
                        dto.setFileDto(null);
                        dto.setFileDto(new FileDto());
                        dto.getFileDto().setFileDescription(task.getFileEntity().getFileDescription());
                        dto.getFileDto().setFilePath(task.getFileEntity().getFilePath());
                        dto.getFileDto().setFileTitle(task.getFileEntity().getFileTitle());
                        dto.getFileDto().setId(task.getFileEntity().getId());
                        dto.setTaskState(task.getTaskState());
			dto.setName(task.getFileEntity().getFileTitle());
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	public void deleteTask(String id) {
		taskService.deleteTask(id);
	}

	@Override
	public void updateTask(String id, String title, String filePath, String description) {
		taskService.updateTask(id, title, filePath, description);
	}
	
}
