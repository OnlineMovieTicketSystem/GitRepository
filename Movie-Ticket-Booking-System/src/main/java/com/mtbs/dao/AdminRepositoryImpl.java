package com.mtbs.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.mtbs.model.Admin;
@Repository
public class AdminRepositoryImpl implements AdminRepository{
	@PersistenceContext
    EntityManager entityManager;
	
	/**
	*getAdminById
	*description of method: gets and admin object based on id from admin table
	*parameters: int id
	*returntype: Admin  
	*method Type: retrieval
	*authorName: Shubham
	*version 1.0
	*/
	@Override
	public Admin getAdminById(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Admin.class, id);
	}

}
