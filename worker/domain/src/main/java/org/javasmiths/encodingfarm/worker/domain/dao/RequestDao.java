package org.javasmiths.encodingfarm.worker.domain.dao;

import java.util.List;
import org.javasmiths.encodingfarm.worker.domain.entity.RequestEntity;

/**
 *
 * @author Pieter
 */
public interface RequestDao {

    public void save(RequestEntity dateEntity);

    public List<RequestEntity> listAll();
}
