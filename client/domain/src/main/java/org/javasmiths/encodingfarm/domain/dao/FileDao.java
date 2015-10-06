/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.domain.dao;

import java.util.List;
import org.javasmiths.encodingfarm.domain.entity.FileEntity;

public interface FileDao {
	public void save(FileEntity fileEntity);

		public List<FileEntity> listAll();
}
