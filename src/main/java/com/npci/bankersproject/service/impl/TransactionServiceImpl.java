package com.npci.bankersproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.bankersproject.entity.Customer;
import com.npci.bankersproject.entity.Transaction;
import com.npci.bankersproject.repository.CustomerRepository;
import com.npci.bankersproject.repository.TransactionRepository;
import com.npci.bankersproject.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	public CustomerRepository customerRepository;

	@Autowired
	public TransactionRepository transactionRepository;

	@Override
	public List<Transaction> getAllTransaction() {
		// TODO Auto-generated method stub
		return (List<Transaction>) transactionRepository.findAll();
	}

	@Override
	public Transaction getTransById(int serialId) {
		// TODO Auto-generated method stub
		return transactionRepository.findById(serialId).orElse(null);
	}

	@Override
	public Transaction addTransaction(Transaction transaction) throws Exception {
		// TODO Auto-generated method stub
		int cId = transaction.getFromId();

		Customer entity = customerRepository.getById(cId);

		double customerBalance = entity.getAccBalance();
		double transAmount = transaction.gettAmount();
		if (customerBalance >= transAmount) {

			// deduct sender customer balance
			entity.setAccBalance(customerBalance - transAmount);
			customerRepository.save(entity);
			

			// add target customer balance
			int cId2 = transaction.getToId();
			Customer entity2 = customerRepository.getById(cId2);
			entity2.setAccBalance(entity2.getAccBalance() + transAmount);
			customerRepository.save(entity2);

		} else {
			// return "Insufficient Balance"
			throw new Exception("Insufficient Balance, Can't perform Transaction. ");
		}
		return transactionRepository.save(transaction);
	}

}
