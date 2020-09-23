package com.gdd.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gdd.springdemo.dao.CustomerDAO;
import com.gdd.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// need to inject the dao
	@Autowired
	private CustomerDAO customerDAO;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		// get customer from the dao
		List<Customer> theCustomers = customerDAO.getCustomers();
		
		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}
}
