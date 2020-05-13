package com.mtbs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mtbs.dao.ShowRepository;
import com.mtbs.exception.ShowException;
import com.mtbs.model.Show;

@Transactional
@Service
public class ShowServiceImpl implements ShowService {

	@Autowired
	private ShowRepository showRepository;

	/**
	 * method name: addShow
	 * method desc: gets a show class object and insert into database through save method
	 * parameters: Show type - show
	 * return type: Show
	 * method type: insertion
	 * author name: Shivani
	 */
	@Override
	public Show addShow(Show show) {
		Show newShow = showRepository.save(show);
		return newShow;
	}

	/**
	 * method name: deleteShow
	 * method desc: gets a id of show and delete it from database through delete by id method.
	 * parameters: int type - id
	 * return type: void
	 * method type: deletion
	 * author name: Shivani
	 */
	@Override
	public void deleteShow(int id) {
		showRepository.deleteById(id);
	}

	
	/**
	 * method name: updateShow
	 * method desc: gets a show class object and update this show object into database through save method
	 * parameters: Show type - show
	 * return type: Show
	 * method type: updation
	 * author name: Shivani
	 */
	@Override
	public Show updateShow(Show show,int id) {
		Show s=showRepository.getShowById(id);
		if(s!=null) {
			show.setId(id);
			showRepository.save(show);
		}
		return show;
	}
	
	/**
	 * method name: getShow
	 * method desc: gets a id of show and fetch from database through get by id method
	 * parameters: int type - id
	 * return type: Show
	 * method type: retrieve
	 * author name: Shivani
	 */
	@Override
	public Show getShow(int id) {
		Show savedShow=showRepository.getShowById(id);
		if(savedShow!=null) {
			return savedShow;
		}
		throw new ShowException("Show with id "+ id+ " does not exists");
	}

	
	/**
	 * method name: getAllShows
	 * method desc: fetch the list of all the shows present in the database
	 * parameters: no parameters
	 * return type: List of Show type
	 * method type: retrieve
	 * author name: Shivani
	 */
	@Override
	public List<Show> getAllShows() {
		List<Show> shows=new ArrayList<Show>();
		showRepository.findAll().forEach(s->shows.add(s));
		return shows;
	}

	
}
