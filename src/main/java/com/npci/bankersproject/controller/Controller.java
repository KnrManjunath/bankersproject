package com.npci.bankersproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.bankersproject.entity.Customer;
import com.npci.bankersproject.entity.Transaction;
import com.npci.bankersproject.service.CustomerService;
import com.npci.bankersproject.service.TransactionService;

import lombok.Data;

@Data
@RestController
@RequestMapping("/customer")
public class Controller {

	@Autowired
	private CustomerService customerService;

	@Autowired
	private TransactionService transactionService;

	@GetMapping("/allCustomers")
	public ResponseEntity<List<Customer>> getAllCustomer() {
		List<Customer> customers = null;

		try {
			customers = customerService.getAllCustomer();
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}

	@GetMapping("/getCustById/{id}")
	@Cacheable(value="customer", key="#cust_id")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int custId) {
		Customer customer = null;

		try {
			customer = customerService.getCustomerById(custId);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}

//	//@PostMapping("/addcustomer")
//	public ResponseEntity<Customer> addOrUpdate(@RequestBody Customer customer) {
//		Customer customers1 = null;
//
//		try {
//			customers1 = customerService.addOrUpdateCustomer(customer);
//		} catch (Exception ex) {
//			ex.getMessage();
//		}
//		return new ResponseEntity<Customer>(customers1, HttpStatus.OK);
////	}
////
	@PostMapping("/addorupdateCustomers")
	public ResponseEntity<Customer> addOrUpdate(@RequestBody Customer customer) {
		Customer customers = null;

		try {
			customers = customerService.addOrUpdateCustomer(customer);
		} catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<Customer>(customers, HttpStatus.OK);
	}

	@DeleteMapping("/deletecustomer/{id}")
	@CacheEvict(value="customer", key="#cust_Id")
	public ResponseEntity<Customer> deleteUserById(@PathVariable("id") int custId) {
		Customer customer = null;

		try {
			customer = customerService.deleteCustomer(custId);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}

	@GetMapping("/getalltransaction")
	public ResponseEntity<List<Transaction>> getAllTransaction() {
		List<Transaction> transaction = null;

		try {
			transaction = transactionService.getAllTransaction();
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<Transaction>>(transaction, HttpStatus.OK);
	}

	@PostMapping("/addtransaction/")
	public ResponseEntity<Transaction> addTransaction(@RequestBody Transaction transaction) {
		Transaction transaction2 = null;

		try {
			transaction2 = transactionService.addTransaction(transaction);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Transaction>(transaction2, HttpStatus.OK);
	}

}
