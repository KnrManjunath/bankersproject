package com.npci.bankersproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.bankersproject.entity.Customer;
import com.npci.bankersproject.repository.CustomerRepository;
import com.npci.bankersproject.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return (List<Customer>) customerRepository.findAll();

	}

	@Override
	public Customer deleteCustomer(int custId) throws Exception {
		// TODO Auto-generated method stub

		Customer deletedCustomer = null;
		try {
			deletedCustomer = customerRepository.findById(custId).orElse(null);
			if (deletedCustomer == null) {
				throw new Exception("No such user");
			} else {
				customerRepository.deleteById(custId);
			}
		} catch (Exception ex) {
			throw ex;
		}
		return null;

	}

//	@Override
//	public Customer addOrUpdateCustomer(String custName, int custAge, String custAddress, long custAadhar,
//			String custPancard, String custEmail, long custPhone, char custSex, float accBalance) {
//		// TODO Auto-generated method stub
//
//		return customerRepository.addCustomer(custName, custAge, custAddress, custAadhar, custPancard, custEmail,
//				custPhone, custSex, accBalance);
//
//	}

	@SuppressWarnings("unchecked")
	@Override
	public Customer addOrUpdateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerById(int custId) throws Exception {
		// TODO Auto-generated method stub
		return customerRepository.getById(custId);
	}

}
