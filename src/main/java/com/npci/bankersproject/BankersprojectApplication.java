package com.npci.bankersproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class BankersprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankersprojectApplication.class, args);
	}

}
