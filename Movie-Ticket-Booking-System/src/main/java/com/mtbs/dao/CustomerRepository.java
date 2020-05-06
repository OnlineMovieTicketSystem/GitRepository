package com.mtbs.dao; 

import
import com.mtbs.model.Booking;
import com.mtbs.model.Seat;
import com.mtbs.model.Show;


public interface CustomerRepository {
	
	public Customer getCustomer(int id, String password);
	public Customer addCustomer(Customer cust);
	public Customer deleteCustomer(Customer cust);
	public List<Customer> viewCustomers();
	public Customer viewCustomerById(int id);
	
	

}
