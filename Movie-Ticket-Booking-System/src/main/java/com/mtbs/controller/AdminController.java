package com.mtbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtbs.exception.AdminNotFoundException;
import com.mtbs.model.Admin;
import com.mtbs.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	/**
	*getAdmin
	*description of method: gets and admin object based on id and password
	*parameters: int id, String password
	*returntype: Admin  
	*method Type: retrieval
	*authorName: Shubham
	*version 1.0
	*/
	@GetMapping("/login/{id}/{password}")
	public Admin getAdmin(@PathVariable("id") int id,@PathVariable("password") String password) throws AdminNotFoundException {
		return adminService.getAdmin(id,password);
	}
}
