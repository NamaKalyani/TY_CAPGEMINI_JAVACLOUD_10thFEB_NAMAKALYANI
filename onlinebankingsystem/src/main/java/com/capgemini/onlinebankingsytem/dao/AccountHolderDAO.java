package com.capgemini.onlinebankingsytem.dao;

import com.capgemini.onlinebankingsytem.bean.ATMSimulator;
import com.capgemini.onlinebankingsytem.bean.AccountHolderLogin;
import com.capgemini.onlinebankingsytem.bean.BenificiaryDetail;
import com.capgemini.onlinebankingsytem.exception.BenificiaryDetailException;
import com.capgemini.onlinebankingsytem.exception.LoginException;

public interface AccountHolderDAO {
	
	public AccountHolderLogin customerLogin(String userName, String password) throws LoginException;

	public ATMSimulator atmSimulator(double amount, String type, int pin);

	public boolean beneficiaryDetail(BenificiaryDetail benificiary) throws BenificiaryDetailException;

	public boolean transfer(String senderName, long accountNumber, double amount, int password);

	void display();

}
