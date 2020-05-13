package com.mtbs.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtbs.dao.AdminRepository;
import com.mtbs.exception.AdminNotFoundException;
import com.mtbs.model.Admin;
@Transactional
@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminRepository adminRepoObj;
	
	
	/**
	*getAdmin
	*description of method: gets an admin object and matches with provided details
	*parameters: int id, String password
	*returntype: Admin  
	*method Type: retrieval
	*authorName: Shubham
	*version 1.0
	*/
	@Override
	public Admin getAdmin(int id, String password) throws AdminNotFoundException {
		Admin admin=(Admin) adminRepoObj.getAdminById(id);
		if(admin.getPassword().equals(password)) {
			return admin;//login successful
		}
		throw new AdminNotFoundException("Admin:"+admin.toString()+"not found");	
		}
}
