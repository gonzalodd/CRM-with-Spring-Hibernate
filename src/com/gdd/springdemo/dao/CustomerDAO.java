package com.gdd.springdemo.dao;

import java.util.List;

import com.gdd.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
}
