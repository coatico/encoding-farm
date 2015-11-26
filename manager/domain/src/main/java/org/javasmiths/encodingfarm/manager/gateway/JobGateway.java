/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.gateway;

import org.javasmiths.encodingfarm.manager.domain.entity.JobEntity;

/**
 *
 * @author Elias Serneels
 */
public interface JobGateway {
    
    public void convert(JobEntity job);

}
