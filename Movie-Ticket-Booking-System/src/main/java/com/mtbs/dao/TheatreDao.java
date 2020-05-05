package com.mtbs.dao;

import java.util.List;
import com.mtbs.model.Theatre;

public interface TheatreDao {

	public Theatre addTheatre(Theatre theatre);
	public void deleteTheatre(int id);
	public void updateTheatre(Theatre t);
	public Theatre viewTheatreById(int id);
	public List<Theatre> viewTheatres();
}
