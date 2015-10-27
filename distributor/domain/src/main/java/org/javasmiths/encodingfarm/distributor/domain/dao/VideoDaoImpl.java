package org.javasmiths.encodingfarm.distributor.domain.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.javasmiths.encodingfarm.common.domain.dao.BaseDaoImpl;
import org.javasmiths.encodingfarm.distributor.domain.entity.VideoEntity;

@Stateless
public class VideoDaoImpl extends BaseDaoImpl<VideoEntity> implements VideoDao {

	@PersistenceContext(unitName = "encoding_distributor")
	protected EntityManager em;

	@Override
	protected EntityManager em() {
		return em;
	}

	@Override
	protected Class<VideoEntity> entityClass() {
		return VideoEntity.class;
	}

	public VideoEntity findById(String id) {
		return em.find(VideoEntity.class, id);
	}

}
