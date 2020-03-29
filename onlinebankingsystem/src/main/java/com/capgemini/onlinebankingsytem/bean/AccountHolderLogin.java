package com.capgemini.onlinebankingsytem.bean;

public class AccountHolderLogin  {
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User1[userName=" + userName + ",password= " + password +")]";
	}
	

}
