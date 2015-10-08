package org.javasmiths.encodingfarm.manager.domain.dao;


import java.util.List;
import org.javasmiths.encodingfarm.manager.domain.entity.SomethingEntity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elias Serneels
 */
public interface SomethingDao {
    public void save(SomethingEntity dataEntity);

		public List<SomethingEntity> listAll();

}
