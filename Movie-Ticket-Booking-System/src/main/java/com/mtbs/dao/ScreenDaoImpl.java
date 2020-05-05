package com.mtbs.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import com.mtbs.model.Screen;

@Repository
public class ScreenDaoImpl implements ScreenDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Screen addScreen(Screen screen) {
		entityManager.persist(screen);
		return screen;
	}

	@Override
	public void deleteScreen(int id) {
		Screen screen=entityManager.find(Screen.class, id);
		entityManager.remove(screen);		
	}

	@Override
	public void updateScreen(Screen s) {
		entityManager.merge(s);			
	}
	
	@Override
	public Screen viewScreenById(int id) {
		return entityManager.find(Screen.class, id);
	}

	@Override
	public List<Screen> viewScreens() {		
		Query q = entityManager.createQuery("select s from Screen s",Screen.class);
		List<Screen> li= q.getResultList();
	    return li;
	}

}
