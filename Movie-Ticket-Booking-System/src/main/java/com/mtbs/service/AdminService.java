package com.mtbs.service;

import com.mtbs.exception.AdminNotFoundException;
import com.mtbs.model.Admin;

public interface AdminService {
	public Admin getAdmin(int id, String password) throws AdminNotFoundException;
}
