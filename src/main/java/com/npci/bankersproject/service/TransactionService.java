package com.npci.bankersproject.service;

import java.util.List;

import com.npci.bankersproject.entity.Transaction;
import com.npci.bankersproject.repository.TransactionRepository;

public interface TransactionService {
	
	public List<Transaction> getAllTransaction();

	public Transaction getTransById(int serialId);

	public Transaction addTransaction(Transaction transaction) throws Exception;


}


