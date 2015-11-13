/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.worker.gateway;

import org.javasmiths.encodingfarm.worker.domain.entity.RequestEntity;

/**
 *
 * @author thomas
 */
public interface VideoConverterGateway {

	public void convert(RequestEntity request);
}
