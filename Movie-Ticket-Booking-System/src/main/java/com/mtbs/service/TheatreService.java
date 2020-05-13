package com.mtbs.service;

import java.util.List;
import com.mtbs.model.Theatre;

public interface TheatreService {
	public Theatre addTheatre(Theatre theatre);
	public void deleteTheatre(int id);
	public Theatre updateTheatre(Theatre theatre);
	public Theatre getTheatre(int id);
	public List<Theatre> getAllTheatre();
}
