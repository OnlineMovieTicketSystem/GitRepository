package com.mtbs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.mtbs.model.Show;

@Repository
public class ShowRepositoryImpl implements ShowRepository {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Show addShow(Show show) {
		manager.persist(show);
		return show;
	}

	@Override
	public boolean deleteShow(int id) {
		Show show=manager.find(Show.class, id);
		manager.remove(show);
		return true;
	}
	
	@Override
	public Show findById(int id) {
		Show show=manager.find(Show.class, id);
		return show;
	}
	
	@Override
	public List<Show> findAll() {
		Query q=manager.createQuery("select s from Show s",Show.class);
		List<Show> list=q.getResultList();
		return list;
	}

	

}
