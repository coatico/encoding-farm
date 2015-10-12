/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.javasmiths.encodingfarm.domain.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.javasmiths.encodingfarm.common.domain.dao.BaseDaoImpl;
import org.javasmiths.encodingfarm.domain.entity.FileEntity;

@Stateless
public class FileDaoImpl extends BaseDaoImpl<FileEntity> implements FileDao {
	@PersistenceContext(unitName = "PU")
	protected EntityManager em;
	
	
	@Override
	protected EntityManager em() {
		return em;
	}

	@Override
	protected Class<FileEntity> entityClass() {
		return FileEntity.class;
	}
        
}
