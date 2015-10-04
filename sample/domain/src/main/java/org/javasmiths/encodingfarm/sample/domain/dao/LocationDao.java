/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.sample.domain.dao;

import java.util.List;
import org.javasmiths.encodingfarm.sample.domain.entity.LocationEntity;

/**
 *
 * @author thomas
 */
public interface LocationDao {
        public void save(LocationEntity dataEntity);

		public List<LocationEntity> listAll();
}
