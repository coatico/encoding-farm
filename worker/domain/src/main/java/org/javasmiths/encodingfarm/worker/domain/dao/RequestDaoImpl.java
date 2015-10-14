
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
public class RequestDaoImpl extends BaseDaoImpl<RequestEntity> implements RequestDao{

    @PersistenceContext(unitName = "requestPU")
    protected EntityManager em;
    
    @Override
    protected EntityManager em() {
        return em;
    }

    @Override
    protected Class<RequestEntity> entityClass() {
        return RequestEntity.class;
    }

}
