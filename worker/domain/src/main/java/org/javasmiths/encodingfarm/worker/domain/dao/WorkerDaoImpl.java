package org.javasmiths.encodingfarm.worker.domain.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.javasmiths.encodingfarm.common.domain.dao.BaseDaoImpl;
import org.javasmiths.encodingfarm.worker.domain.entity.WorkerEntity;

/**
 *
 * @author Pieter
 */
@Stateless
public class WorkerDaoImpl extends BaseDaoImpl<WorkerEntity> implements WorkerDao {

    @PersistenceContext(unitName = "workerPU")
    protected EntityManager em;

    @Override
    protected EntityManager em() {
        return em;
    }

    @Override
    protected Class<WorkerEntity> entityClass() {
        return WorkerEntity.class;
    }

}
