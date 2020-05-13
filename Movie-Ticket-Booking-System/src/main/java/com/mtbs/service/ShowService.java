package com.mtbs.service;

import java.util.List;

import com.mtbs.model.Show;

public interface ShowService {
	
	public Show addShow(Show show);
	public void deleteShow(int id);
	public Show getShow(int id);
	public List<Show> getAllShows();
	public Show updateShow(Show show,int id);

	
}
