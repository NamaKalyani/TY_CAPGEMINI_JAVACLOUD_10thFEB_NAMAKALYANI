package com.capgemini.onlinebankingsytem.bean;

public class BankAdmin  {
	
	private String userName;
	private String password;
	
	public BankAdmin(String username, String password) {
		this.userName=username;
		this.password=password;
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName(String username) {
		this.userName = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User1[username=" + userName + ",password= " + password +")]";
	}
	

}
