package com.mtbs.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.mtbs.model.Admin;
import com.mtbs.model.Booking;
@Repository
public class AdminRepositoryImpl implements AdminRepository{
	@PersistenceContext
    EntityManager entityManager;
	
	/*public Admin viewAdminById(int id) {
		return em.find(Admin.class, id);
	}*/
	@Override
	public Admin retrieveAdmin(String name, String password) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("select * from Admin where username="+name+" and password="+password, Admin.class);
		Admin admin=(Admin) query.getResultList().get(0);
		return admin;
	}

}
