package com.mtbs.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import com.mtbs.model.Theatre;

@Repository
public class TheatreDaoImpl implements TheatreDao {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Theatre addTheatre(Theatre theatre) {
		
		entityManager.persist(theatre);
		return theatre;
	}

	@Override
	public void deleteTheatre(int id) {
		Theatre theatre=entityManager.find(Theatre.class, id);
		entityManager.remove(theatre);		
	}

	@Override
	public void updateTheatre(Theatre t) {
		entityManager.merge(t);				
	}
	
	@Override
	public Theatre viewTheatreById(int id) {
		return entityManager.find(Theatre.class, id);
	}

	@Override
	public List<Theatre> viewTheatres() {
		Query q = entityManager.createQuery("select t from Theatre t",Theatre.class);
		List<Theatre> li= q.getResultList();
	    return li;
	
	}
	

}
