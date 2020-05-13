package com.mtbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mtbs.model.Show;
import com.mtbs.service.ShowService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/show")
public class ShowController {
	
	@Autowired
	MovieController movie;
	
	@Autowired
	private ShowService showService;
	
	
	/**
	 * method name: addShow
	 * method desc: add a show class object by calling the method of service class.
	 * parameters: Show type - show
	 * return type: Show
	 * method type: post
	 * author name: Shivani
	 */
	@RequestMapping(value="/shows",method=RequestMethod.POST)
	public Show addShow(@RequestBody Show show) {
		return showService.addShow(show);
	}
	
	/**
	 * method name: getShow
	 * method desc: to fetch the details of show through show id by calling the method of service class.
	 * parameters: int type - id
	 * return type: Show
	 * method type: get
	 * author name: Shivani
	 */
	@GetMapping(value="/shows/{id}")
	public Show getShow(@PathVariable("id") int id){
		Show show=showService.getShow(id);
		return show;
	}
	
	/**
	 * method name: getAllShows
	 * method desc: calls the method of service class and fetch all shows.
	 * parameters: no parameters
	 * return type: List of Show Type
	 * method type: get
	 * author name: Shivani
	 */
	@GetMapping(value="/shows")
	public List<Show> listOfShows(){
		return showService.getAllShows();
	}
	
	
	/**
	 * method name: deleteShow
	 * method desc: to delete the show through show id by calling the method of service class.
	 * parameters: int type - id
	 * return type: boolean
	 * method type: delete
	 * author name: Shivani
	 */
	@DeleteMapping(value="/shows/{id}")
	public boolean deleteMovie(@PathVariable("id") int id) {
		showService.deleteShow(id);
		return true;
	}
	
	/**
	 * method name:updateShow
	 * method desc: to update the show object by calling the method of service class.
	 * parameters: Show type- show
	 * return type: Show
	 * method type: put
	 * author name: Shivani
	 */
	@PutMapping(value="/shows/{id}")
	public Show updateShow(@RequestBody Show show,@PathVariable int id) {
		Show savedShow=showService.updateShow(show,id);
		return savedShow;
	}
	
}

