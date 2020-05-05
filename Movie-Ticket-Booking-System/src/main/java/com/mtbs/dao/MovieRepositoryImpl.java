package com.mtbs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.mtbs.model.Movie;


@Repository
public class MovieRepositoryImpl implements MovieRepository {
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Movie addMovie(Movie movie) {
		manager.persist(movie);
		return movie;
	}

	@Override
	public boolean deleteMovie(int id) {
		Movie movie=manager.find(Movie.class, id);
		manager.remove(movie);
		return true;
	}

	@Override
	public Movie findById(int id) {
		Movie movie=manager.find(Movie.class, id);
		return movie;
	}

	@Override
	public List<Movie> findAll() {
		Query q=manager.createQuery("select m from Movie m",Movie.class);
		List<Movie> list=q.getResultList();
		return list;
	}

	@Override
	public void updateMovie(Movie movie) {
		manager.merge(movie);
	}
	
	
}
