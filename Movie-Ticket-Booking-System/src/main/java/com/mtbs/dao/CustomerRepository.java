package com.mtbs.dao; 



public interface CustomerRepository {
	
	public Customer getCustomer(int id, String password);
	public Customer addCustomer(Customer cust);
	public Customer deleteCustomer(Customer cust);
	public List<Customer> viewCustomers();
	public Customer viewCustomerById(int id);
	
	

}
