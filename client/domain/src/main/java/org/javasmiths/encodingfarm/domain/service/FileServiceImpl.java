/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.javasmiths.encodingfarm.domain.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.domain.dao.FileDao;
import org.javasmiths.encodingfarm.domain.entity.FileEntity;

@Stateless
public class FileServiceImpl implements FileService{
	@EJB
	private FileDao dao;

	@Override
	public FileEntity registerFile(String filePath) {
		FileEntity fileEntity = new FileEntity();
		fileEntity.setPath(filePath);
		dao.save(fileEntity);
		return fileEntity;
	}

	@Override
	public List<FileEntity> listAll() {
		return dao.listAll();
	}

}
