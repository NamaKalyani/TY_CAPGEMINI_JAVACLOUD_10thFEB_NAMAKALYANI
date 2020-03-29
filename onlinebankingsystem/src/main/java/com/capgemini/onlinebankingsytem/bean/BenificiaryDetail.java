package com.capgemini.onlinebankingsytem.bean;

public class BenificiaryDetail {
	
	private String firstName;
	private String lastName;
	private long accountNumber;
	private String emailId;
	private String phoneNumber;
	
	public String getfirstName() {
		return firstName;
	}
	public void setfirstname(String firstName) {
		this.firstName = firstName;
	}
	
	public String getlastname() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public long getaccountnumber() {
		return accountNumber;
	}
	public void setaccountnumber(long accountnumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getemailid() {
		return emailId;
	}
	public void setemailid(String emailid) {
		this.emailId = emailId;
	}
	
	public String getphonenumber() {
		return phoneNumber;
	}
	public void setphonenumber(String phonenumber) {
		this.phoneNumber = phoneNumber;
	}


}
