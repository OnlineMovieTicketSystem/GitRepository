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
import com.mtbs.model.Screen;
import com.mtbs.service.ScreenService;

@RestController
@RequestMapping("/mtbs")
public class ScreenController {
	  @Autowired 
	  private ScreenService screenService;
	
	   /**
	    * method name: addScreen
	    * method desc: to add a object of screen class by passing object by calling the method of service class.
	    * parameters:  Screen class type-screen
	    * returns:     Screen 
	    * method type: post
	    * author name: Ruchi
	    */      
		@RequestMapping(value="/screens",method=RequestMethod.POST)
		public Screen addScreen(@RequestBody Screen screen) {
			return screenService.addScreen(screen);
		}
		
		/**
		 * method name: listOfScreen
		 * method desc: to fetch details of all screens through uri by calling method of service class.  
		 * parameters:  no parameters
		 * returns:     list of screen type
		 * method type: get
		 * author name: Ruchi
		 */ 			
		@GetMapping(value="/screens")
		public List<Screen> listOfScreen(){
			return screenService.getAllScreen();
		}
		
		/**
		 * method name: getAllScreen
		 * method desc: to delete  screen by passing screen id through uri by calling the method of service class.
		 * parameters:  int type-id
		 * returns:     boolean 
		 * method type: delete
		 * author name: Ruchi
		 */ 		
		@DeleteMapping(value="/screens/{id}")
		    public boolean deleteScreen(@PathVariable("id") int id) {
			screenService.deleteScreen(id);
			  return true;
		}
		
		/**
		 * method name: getScreen
		 * method desc: to fetch the details of screen by passing screen id through uri by calling method of service class.
		 * parameters:  int type-id
		 * returns:     Screen 
		 * method type: get
		 * author name: Ruchi
		 */ 		
		@GetMapping(value="/screens/{id}")
		public Screen getScreen(@PathVariable("id") int id){
	           Screen screen=screenService.getScreen(id);
	           return screen;
		}
		

		/**
		 * method name: updateScreen
		 * method desc: update the object of theatre by passing object by calling the method of service class.
		 * parameters:  Screen class type-screen
		 * returns:     Screen 
		 * method type: put
		 * author name: Ruchi
		 */ 
		@PutMapping(value="/screens")
		public Screen updateScreen(@RequestBody Screen screen) {
			return screenService.updateScreen(screen);		
		}
	

}
