/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.worker.domain.service;

import java.util.List;
import org.javasmiths.encodingfarm.worker.domain.entity.RequestEntity;

/**
 *
 * @author Quintendockx
 */
public interface RequestService {
 
    RequestEntity registerRequest(String video_path);
    

	
    List<RequestEntity> listAll();

}
