/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.common.domain.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author thomas
 */
public abstract class BaseDaoImpl<E> {
    
    protected abstract EntityManager em();
	
	 protected abstract Class<E> entityClass();

    public void save(E dataEntity) {
        em().persist(dataEntity);
    }
    
     //Gegevens opzoeken in database aan de hand van een opgegeven id
    public E findById(String id) {
        return em().find(entityClass(), id);
    }
    
    //Gegevens uit de database verwijderen.
    public void deleteById(String id) {
        em().remove(findById(id));
    }

	public List<E> listAll() {
        CriteriaQuery cq = em().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass()));
        Query q = em().createQuery(cq);
        return q.getResultList();
    }
}
