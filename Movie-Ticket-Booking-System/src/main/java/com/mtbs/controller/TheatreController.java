package com.mtbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mtbs.model.Theatre;
import com.mtbs.service.TheatreService;

@RestController
@RequestMapping("/mtbs")
public class TheatreController {
	
	@Autowired 
	private TheatreService theatreService;
	
	/**
	 * method name: addTheatre
	 * method desc: to add a object of theatre class by passing object by calling the method of service class.
	 * parameters:  Theatre class type-theatre
	 * returns:     Theatre 
	 * method type: post
	 * author name: Ruchi
	 */ 
	@RequestMapping(value="/theatres",method=RequestMethod.POST) 
	public Theatre addTheatre(@RequestBody Theatre theatre) {
		return theatreService.addTheatre(theatre);
	}
	
	/**
	 * method name: listOfTheatre
	 * method desc: to fetch details of all theatres through uri by calling method of service class. 
	 * parameters:  no parameters
	 * returns:     list of theatre type
	 * method type: get
	 * author name: Ruchi
	 */ 
	@GetMapping(value="/theatres")
	public List<Theatre> listOfTheatre(){
		return theatreService.getAllTheatre();
	}
	
	/**
	 * method name: getAllTheatre
	 * method desc: to delete  theatre by passing theatre id through uri by calling the method of service class.
	 * parameters:  int type-id
	 * returns:     boolean 
	 * method type: delete
	 * author name: Ruchi
	 */ 
	@DeleteMapping(value="/theatres/{id}")
	    public boolean deleteTheatre(@PathVariable("id") int id) {
		  theatreService.deleteTheatre(id);
		  return true;
	}
	/**
	 * method name: getTheatre
	 * method desc: to fetch the details of theatre by passing theatre id through uri by calling method of service class.
	 * parameters:  int type-id
	 * returns:     Theatre 
	 * method type: get
	 * author name: Ruchi
	 */ 
	@GetMapping(value="/theatres/{id}")
	public Theatre getTheatre(@PathVariable("id") int id){
           Theatre theatre=theatreService.getTheatre(id);
           return theatre;
	}
	
	/**
	 * method name: updateTheatre
	 * method desc: update the object of theatre by passing object by calling the method of service class.
	 * parameters:  Theatre class type-theatre
	 * returns:     Theatre 
	 * method type: put
	 * author name: Ruchi
	 */ 
	@PutMapping(value="/theatres")
	public Theatre updateTheatre(@RequestBody Theatre theatre) {
		return theatreService.updateTheatre(theatre);		
		}

}
