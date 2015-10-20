/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.worker.domain.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.javasmiths.encodingfarm.common.domain.dao.BaseDaoImpl;
import org.javasmiths.encodingfarm.worker.domain.entity.PathEntity;

/**
 *
 * @author Pieter
 */
public class PathDaoImpl extends BaseDaoImpl<PathEntity> implements PathDao {

    @PersistenceContext(unitName = "pathPU")
    protected EntityManager em;

    @Override
    protected EntityManager em() {
        return em;
    }

    @Override
    protected Class<PathEntity> entityClass() {
        return PathEntity.class;
    }

}
