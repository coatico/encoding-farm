/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.worker.domain.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.worker.domain.dao.RequestDao;
import org.javasmiths.encodingfarm.worker.domain.entity.RequestEntity;

/**
 *
 * @author Quintendockx
 */
@Stateless
public class RequestServiceImpl implements RequestService {

    @EJB
    private RequestDao dao;

    @Override
    public RequestEntity registerRequest(String path) {
        RequestEntity re = new RequestEntity();
        re.setPath(path);

        dao.save(re);
        return re;
    }

    @Override
    public List<RequestEntity> listAll() {
        return dao.listAll();
    }

}