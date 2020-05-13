package com.mtbs.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mtbs.dao.ScreenRepository;
import com.mtbs.exception.ApplicationException;
import com.mtbs.model.Screen;
@Transactional
@Service
public class ScreenServiceImpl implements ScreenService {
	@Autowired
	private ScreenRepository screenRepository;
	
	/**
	 * method name: addScreen
	 * method desc: get a Screen class object and insert into database through save method.
	 * parameters:  Screen type-screen
	 * returns:     Screen
	 * method type: insertion
	 * author name: Ruchi
	 */
	@Override
	public Screen addScreen(Screen screen) {
		try {
		return screenRepository.save(screen);
		}
		catch(Exception e)
		{
		throw new ApplicationException("Screen with id : "+screen.getId()+" already exist.");
		}		
	}
	
	/**
	 * method name: deleteScreen
	 * method desc: get a id of Screen and delete it from database through delete by id method.
	 * parameters:  int type-id
	 * returns:     void
	 * method type: deletion
	 * author name: Ruchi
	 */
	@Override
	public void deleteScreen(int id) {
		screenRepository.deleteById(id);
	
	}
	
	/**
	 * method name: updateScreen
	 * method desc: get a Screen class object and update it from database through save method.
	 * parameters:  Screen type-screens
	 * returns:     Screen
	 * method type: updation
	 * author name: Ruchi
	 */
	@Override
	public Screen updateScreen(Screen screen) {
		Screen updateScreen=screenRepository.save(screen);
		if(updateScreen!=null)
		{
		return screenRepository.save(screen);
		}
		else
		{
		throw new ApplicationException("Screen with id : "+screen.getId()+" does not exist.");
		}		
	}
	
	/**
	 * method name: getScreen
	 * method desc: to fetch the details of screen from database through screen id by findById method.
	 * parameters:  int type-id
	 * returns:     Screen
	 * method type: retrieval
	 * author name: Ruchi
	 */
	@Override
	public Screen getScreen(int id) {	
		return screenRepository.findById(id).get();
	}
	
	/**
	 * method name: getAllScreen
	 * method desc: to fetch the details of theatres by findAll method.
	 * parameters:  no parametrs
	 * returns:     list of screen type
	 * method type: retrieval
	 * author name: Ruchi
	 */ 
	@Override
	public List<Screen> getAllScreen() {
		List<Screen> screens=new ArrayList<Screen>();
	    screenRepository.findAll().forEach(s->screens.add(s));
	    return screens;
	}


}
