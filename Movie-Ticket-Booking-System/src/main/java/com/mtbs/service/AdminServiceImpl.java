package com.mtbs.service;

import com.mtbs.dao.AdminRepository;
import com.mtbs.dao.AdminRepositoryImpl;
import com.mtbs.model.Admin;

public class AdminServiceImpl implements AdminService{

	@Override
	public Admin getAdmin(int id, String password) {
		AdminRepository adminRepoObj=new AdminRepositoryImpl();
		Admin admin=adminRepoObj.getAdmin(id,password);
		if((admin.getId())==id&&(admin.getPassword().equals(password))) {
		return admin;//login successful
		}
		return null;
	}

}
