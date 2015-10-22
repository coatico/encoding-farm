/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.distributor.domain.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import org.javasmiths.encodingfarm.common.domain.dao.BaseDaoImpl;
import org.javasmiths.encodingfarm.distributor.domain.entity.VideoEntity;

/**
 *
 * @author thomas
 */
@Stateless
public class VideoDaoImpl extends BaseDaoImpl<VideoEntity> implements VideoDao{

    @PersistenceContext(unitName = "encoding_distributor")
    protected EntityManager em;

    @Override
    protected EntityManager em() {
        return em;
    }

    @Override
    protected Class<VideoEntity> entityClass() {
        return VideoEntity.class;
    }
	

    public void save(VideoEntity videoEntity) {
        em.merge(videoEntity);
    }

    public List<VideoEntity> listAll() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(VideoEntity.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }

    public VideoEntity findById(String id) {
        if(id == null){
            return null;
        }
        return em.find(VideoEntity.class, id);
    }

    public void deleteById(String id) {
        em.remove(findById(id));
    }

}
