package com.mtbs.dao;

import com.mtbs.model.Admin;

public interface AdminRepository {
	public Admin getAdmin(int id, String password);

}
