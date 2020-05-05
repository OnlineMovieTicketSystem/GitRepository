package com.mtbs.dao;

import java.util.List;

import com.mtbs.model.Show;

public interface ShowRepository{
	
	public Show addShow(Show show);
	public boolean deleteShow(int id);
	public Show findById(int id);
	public List<Show> findAll();

}
