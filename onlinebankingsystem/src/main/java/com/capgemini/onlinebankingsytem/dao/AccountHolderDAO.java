package com.capgemini.onlinebankingsytem.dao;

public interface AccountHolderDAO {
	
	public void login(String username , String password);
	public void sendTo(String firstName,String lastName,long accountNumber,String email,long phoneNumber);
	public void changePassword(String username,String password, String confirmPassword);
	public void requestChequeBook();
	

}
