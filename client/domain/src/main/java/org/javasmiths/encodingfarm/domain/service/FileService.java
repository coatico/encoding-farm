/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.domain.service;

import java.util.List;
import org.javasmiths.encodingfarm.domain.entity.FileEntity;


public interface FileService {
	FileEntity registerFile(String filePath);
	
	List<FileEntity> listAll();
}
