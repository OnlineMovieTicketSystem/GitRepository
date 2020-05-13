package com.mtbs.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.mtbs.model.Theatre;

@Repository
public interface TheatreRepository extends CrudRepository<Theatre,Integer>{

}
