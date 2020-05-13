package com.mtbs.service;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtbs.dao.TheatreRepository;
import com.mtbs.exception.ApplicationException;
import com.mtbs.model.Theatre;
@Transactional
@Service
public class TheatreServiceImpl implements TheatreService {

	@Autowired 
	private TheatreRepository theatreRepository;
	
	/**
	 * method name: addTheatre
	 * method desc: get a theatre class object and insert into database through save method
	 * parameters:  Theatre type-theatre
	 * returns:     Theatre
	 * method type: insertion
	 * author name: Ruchi
	 */
	@Override
	public Theatre addTheatre(Theatre theatre) {
		try 
		{
		return theatreRepository.save(theatre);
	    }
		catch(Exception e){		
		throw new ApplicationException("Theatre with id : "+theatre.getId()+" already exist.");
		}	
	}
	
	/**
	 * method name: deleteTheatre
	 * method desc: get a id of theatre and delete it from database through deleteById method.
	 * parameters:  int type-id
	 * returns:     void
	 * method type: deletion
	 */
	@Override
	public void deleteTheatre(int id) {
		theatreRepository.deleteById(id);
	}
	
	/**
	 * method name: updateTheatre
	 * method desc: get a theatre class object and update it from database through save method.
	 * parameters:  Theatre type-theatre
	 * returns:     Theatre
	 * method type: updation
	 */
	
	@Override
	public Theatre updateTheatre(Theatre theatre) {
		Theatre updateMovie=theatreRepository.save(theatre);
	    if(updateMovie!=null)
		{
		return theatreRepository.save(theatre);
		}
		else
		{
		throw new ApplicationException("Theatre with id : "+theatre.getId()+" does not exist.");
		}
	 }
     
	/**
	 * method name: getTheatre
	 * method desc: to fetch the details of theatre from database through theatre id by findById method.
	 * parameters:  int type-id
	 * returns:     Theatre
	 * method type: retrieval
	 */
	
	@Override
	public Theatre getTheatre(int id) {
		return theatreRepository.findById(id).get();
	 }
	
	/**
	 * method name: getAllTheatre
	 * method desc: to fetch the details of theatres by findAll method.
	 * parameters:  no parametrs
	 * returns:     list of theatre type
	 * method type: retrieval
	 * author name: Ruchi
	 */ 
	@Override
	public List<Theatre> getAllTheatre() {
		List<Theatre> theatres=new ArrayList<Theatre>();
		theatreRepository.findAll().forEach(t->theatres.add(t));
		return theatres;
	 }

}
