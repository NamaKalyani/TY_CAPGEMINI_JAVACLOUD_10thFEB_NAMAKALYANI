package com.capgemini.onlinebankingsytem.bean;

import java.io.Serializable;

public class AccountHolder implements Serializable {
	
	private String firstname;
	private String lastname;
	private String gender;
	private String dateofbirth;
	private  long adharnumber;
	private String emailid;
	private long phonenumber;
	private String address;
	private String bankbranch;
	private long accountnumber;
	private double openingbalance;
	private int pin;
	private String username;
	private String password;
	
	public String getfirstname() {
		return firstname;
	}
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getlastname() {
		return lastname;
	}
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	
	public String getdateofbirth() {
		return dateofbirth;
	}
	public void setdateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	public long getadharnumber() {
		return adharnumber;
	}
	public void setadharnumber(long adharnumber) {
		this.adharnumber = adharnumber;
	}
	
	public String getemilid() {
		return emailid;
	}
	public void setemailid(String emailid) {
		this.emailid = emailid;
	}
	
	public long getphonenumber() {
		return phonenumber;
	}
	public void setphonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	
	public String getbankbranch() {
		return bankbranch;
	}
	public void setbankbranch(String bankbranch) {
		this.bankbranch = bankbranch;
	}
	
	public long getaccountnumber() {
		return accountnumber;
	}
	public void setaccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	
	public double getopeningbalance() {
		return openingbalance;
	}
	public void setopeningbalance(double openingbalanace) {
		this.openingbalance = openingbalance;
	}
	
	public int getpin() {
		return pin;
	}
	public void setpin(int pin) {
		this.pin = pin;
	}
	
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}


}
