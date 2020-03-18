package com.capgemini.onlinebankingsytem.dao;

public interface BenificiaryDAO {
	public void sentTo(String firstName,String lastName,long accountNumber,String email,long phoneNumber);
}
