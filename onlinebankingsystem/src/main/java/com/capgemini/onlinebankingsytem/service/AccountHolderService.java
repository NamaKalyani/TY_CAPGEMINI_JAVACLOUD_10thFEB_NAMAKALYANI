package com.capgemini.onlinebankingsytem.service;

import com.capgemini.onlinebankingsytem.bean.ATMSimulator;
import com.capgemini.onlinebankingsytem.bean.AccountHolderLogin;
import com.capgemini.onlinebankingsytem.bean.BenificiaryDetail;
import com.capgemini.onlinebankingsytem.exception.BenificiaryDetailException;
import com.capgemini.onlinebankingsytem.exception.LoginException;

public interface AccountHolderService {
	
	public AccountHolderLogin userLogin(String userName, String password) throws LoginException;

	public ATMSimulator atmSimulator(double amount, String type, int pin);

	public boolean beneficiaryDetail(BenificiaryDetail benificiary) throws BenificiaryDetailException;

	public boolean transfer(String senderName, long accountNumber1, double amount, int password);
	
	public void display();


}
