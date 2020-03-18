package com.capgemini.onlinebankingsytem.bean;

import java.io.Serializable;

public class AccountHolderLogin implements Serializable {
	
	private String username;
	private String password;
	
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
