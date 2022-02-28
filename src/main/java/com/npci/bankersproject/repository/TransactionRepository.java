package com.npci.bankersproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.bankersproject.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
