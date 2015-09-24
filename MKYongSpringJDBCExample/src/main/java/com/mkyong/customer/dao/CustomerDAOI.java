package com.mkyong.customer.dao;

import com.mkyong.customer.model.Customer;

public interface CustomerDAOI 
{
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
	public Customer findByCustomerName(String name);
	
	
	
}




