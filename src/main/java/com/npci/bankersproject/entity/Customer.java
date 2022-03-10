package com.npci.bankersproject.entity;

import java.io.Serializable;

import javax.persistence.*;

//import lombok.Data;

//@Data
@Entity
@Table(name = "customer")
public class Customer implements Serializable  {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cust_id")
	private int custId;

	@Column(name = "cust_name")
	private String custName;

	@Column(name = "cust_age")
	private int custAge;

	@Column(name = "cust_address")
	private String custAddress;

	@Column(name = "cust_aadhar")
	private long custAadhar;

	@Column(name = "cust_pancard")
	private String custPancard;

	@Column(name = "cust_email")
	private String custEmail;

	@Column(name = "cust_phone")
	private long custPhone;

	@Column(name = "sex")
	private char custSex;

	@Column(name = "acc_balance")
	private double accBalance;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getCustAge() {
		return custAge;
	}

	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public long getCustAadhar() {
		return custAadhar;
	}

	public void setCustAadhar(long custAadhar) {
		this.custAadhar = custAadhar;
	}

	public String getCustPancard() {
		return custPancard;
	}

	public void setCustPancard(String custPancard) {
		this.custPancard = custPancard;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public long getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(long custPhone) {
		this.custPhone = custPhone;
	}

	public char getCustSex() {
		return custSex;
	}

	public void setCustSex(char custSex) {
		this.custSex = custSex;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	public Customer(int custId, String custName, int custAge, String custAddress, long custAadhar, String custPancard,
			String custEmail, long custPhone, char custSex, double accBalance) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAge = custAge;
		this.custAddress = custAddress;
		this.custAadhar = custAadhar;
		this.custPancard = custPancard;
		this.custEmail = custEmail;
		this.custPhone = custPhone;
		this.custSex = custSex;
		this.accBalance = accBalance;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAge=" + custAge + ", custAddress="
				+ custAddress + ", custAadhar=" + custAadhar + ", custPancard=" + custPancard + ", custEmail="
				+ custEmail + ", custPhone=" + custPhone + ", custSex=" + custSex + ", accBalance=" + accBalance + "]";
	}

	
	

	
}

