package org.javasmiths.encodingfarm.manager.domain.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.javasmiths.encodingfarm.common.domain.dao.BaseDaoImpl;
import org.javasmiths.encodingfarm.manager.domain.entity.VideoEntity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Elias Serneels
 */
@Stateless
public class VideoDaoImpl extends BaseDaoImpl<VideoEntity> implements VideoDao {

    @PersistenceContext(unitName = "managerPU")
    protected EntityManager em;

    @Override
    protected EntityManager em() {
        return em;
    }

    @Override
    protected Class<VideoEntity> entityClass() {
        return VideoEntity.class;
    }

    @Override
    public VideoEntity findById(String id) {
        return em.find(VideoEntity.class, id);
    }

}
