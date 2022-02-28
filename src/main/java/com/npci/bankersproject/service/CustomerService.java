package com.npci.bankersproject.service;

import java.util.List;

import com.npci.bankersproject.entity.Customer;
import com.npci.bankersproject.repository.CustomerRepository;

public interface CustomerService  {
	
	public List<Customer> getAllCustomer();

	public Customer getCustomerById(int custId) throws Exception;


	public Customer deleteCustomer(int custID) throws Exception;

	public Customer addOrUpdateCustomer(Customer customer);


}
