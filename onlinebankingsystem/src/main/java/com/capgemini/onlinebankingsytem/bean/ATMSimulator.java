package com.capgemini.onlinebankingsytem.bean;

import java.io.Serializable;

public class ATMSimulator implements Serializable {
	
	private double amount;
	private String type;
	private int pin;
	
	public double getamount() {
		return amount;
	}
	public void setamount(double amount) {
		this.amount = amount;
	}
	
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type = type;
	}
	
	public int getpin() {
		return pin;
	}
	public void setpin(int pin) {
		this.pin = pin;
	}

}
