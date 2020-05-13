package com.mtbs.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.mtbs.model.Screen;

@Repository
public interface ScreenRepository extends CrudRepository<Screen,Integer>{
	
}
