package com.mtbs.dao;

import com.mtbs.model.Admin;

public interface AdminRepository {
	public Admin retrieveAdmin(String name, String password);

}
