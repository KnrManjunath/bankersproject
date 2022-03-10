package com.npci.bankersproject.entity;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Data

@Entity
@Table(name = "bk_trans")
public class Transaction implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "serial_id")
	private long serialId;

	@Column(name = "from_cust_id")
	private int fromId;

	@Column(name = "to_cust_id")
	private int toId;

	@Column(name = "t_amount")
	private double tAmount;

	@Column(name = "trans_id")
	private String transId;

	public long getSerialId() {
		return serialId;
	}

	public void setSerialId(long serialId) {
		this.serialId = serialId;
	}

	public int getFromId() {
		return fromId;
	}

	public void setFromId(int fromId) {
		this.fromId = fromId;
	}

	public int getToId() {
		return toId;
	}

	public void setToId(int toId) {
		this.toId = toId;
	}

	public double gettAmount() {
		return tAmount;
	}

	public void settAmount(double tAmount) {
		this.tAmount = tAmount;
	}

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public Transaction(long serialId, int fromId, int toId, double tAmount, String transId) {
		super();
		this.serialId = serialId;
		this.fromId = fromId;
		this.toId = toId;
		this.tAmount = tAmount;
		this.transId = transId;
	}

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Transaction [serialId=" + serialId + ", fromId=" + fromId + ", toId=" + toId + ", tAmount=" + tAmount
				+ ", transId=" + transId + "]";
	}

	

	
}

