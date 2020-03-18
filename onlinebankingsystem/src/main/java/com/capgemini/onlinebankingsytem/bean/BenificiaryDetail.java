package com.capgemini.onlinebankingsytem.bean;

import java.io.Serializable;

public class BenificiaryDetail implements Serializable {
	
	private String firstname;
	private String lastname;
	private long accountnumber;
	private String emailid;
	private long phonenumber;
	
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
	
	public long getaccountnumber() {
		return accountnumber;
	}
	public void setaccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	
	public String getemailid() {
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


}
