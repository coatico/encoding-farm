package org.javasmiths.encodingfarm.worker.domain.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.javasmiths.encodingfarm.common.domain.dao.BaseDaoImpl;
import org.javasmiths.encodingfarm.worker.domain.entity.RequestEntity;

/**
 *
 * @author Pieter
 */
@Stateless
public class RequestDaoImpl extends BaseDaoImpl<RequestEntity> implements RequestDao {

    @PersistenceContext(unitName = "workerPU")
    protected EntityManager em;

    @Override
    protected EntityManager em() {
        return em;
    }

    @Override
    protected Class<RequestEntity> entityClass() {
        return RequestEntity.class;
    }
    
    @Override
    public RequestEntity findById(String id) {
        return em.find(RequestEntity.class, id);
    }

}
