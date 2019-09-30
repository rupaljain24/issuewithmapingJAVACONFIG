package com.worldpay.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.worldpay.dao.CustomerDao;
import com.worldpay.entities.Customer;

public class CustomerServicesImpl implements CustomerServices {

	@Autowired
	private CustomerDao customerDAO;

	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	
}
