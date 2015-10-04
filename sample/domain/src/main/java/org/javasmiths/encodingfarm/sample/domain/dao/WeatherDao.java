/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.sample.domain.dao;

import org.javasmiths.encodingfarm.sample.domain.entity.WeatherDataEntity;

/**
 *
 * @author thomas
 */
public interface WeatherDao {
    
    public void save(WeatherDataEntity dataEntity);
}
