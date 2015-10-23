/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.service;

import java.util.List;
import org.javasmiths.encodingfarm.manager.domain.entity.WorkerEntity;

/**
 *
 * @author Arne Polfliet
 */
public interface WorkerService {

    WorkerEntity registerWorker(String name);

    WorkerEntity deleteWorker(String id);

    WorkerEntity disableWorker(String name);

    List<WorkerEntity> listAll();
}
