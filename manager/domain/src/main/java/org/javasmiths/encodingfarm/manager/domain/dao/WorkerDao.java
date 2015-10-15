/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.dao;

/**
 *
 * @author Arne
 */

import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import org.javasmiths.encodingfarm.manager.domain.entity.WorkerEntity;



//deze klasse wordt gebruikt om de link te leggen met de db
@Stateless
public class WorkerDao implements Serializable {

    @PersistenceContext
    private EntityManager em;

    //Gegevens opslaan in de database
    public void save(WorkerEntity WorkerEntity) {
        em.persist(WorkerEntity);
    }

    public List<WorkerEntity> listAll() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(WorkerEntity.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }

    //Alle gegevens uit de db lezen 
    public List<WorkerEntity> getIndexListAll(int i) {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(WorkerEntity.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }

    // Gegevens opzoeken uit de db aan de hand van een id
    public WorkerEntity findById(String id) {
        return em.find(WorkerEntity.class, id);
    }

    //Gegevens uit de database verwijderen aan de hand van een id die opgegeven is.
    public void deleteById(String id) {
        em.remove(findById(id));
    }

    //Gegevens in de database updaten.
    public void update(WorkerEntity WorkerEntity) {
        em.merge(WorkerEntity);

    }
}