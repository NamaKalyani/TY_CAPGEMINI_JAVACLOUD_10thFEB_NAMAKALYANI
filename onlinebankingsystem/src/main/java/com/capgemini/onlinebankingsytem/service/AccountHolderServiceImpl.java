package com.capgemini.onlinebankingsytem.service;

import com.capgemini.onlinebankingsytem.bean.ATMSimulator;
import com.capgemini.onlinebankingsytem.bean.AccountHolderLogin;
import com.capgemini.onlinebankingsytem.bean.BenificiaryDetail;
import com.capgemini.onlinebankingsytem.dao.AccountHolderDAO;
import com.capgemini.onlinebankingsytem.exception.BenificiaryDetailException;
import com.capgemini.onlinebankingsytem.exception.LoginException;
import com.capgemini.onlinebankingsytem.factory.AccountHolderFactory;

public class AccountHolderServiceImpl implements AccountHolderService {
	
	private AccountHolderDAO accountholderdao = AccountHolderFactory.getAccountHolderDAO();

	@Override
	public AccountHolderLogin userLogin(String userName, String password) throws LoginException {
		return accountholderdao.customerLogin(userName, password);
	}

	@Override
	public ATMSimulator atmSimulator(double amount, String type, int pin) {
		return accountholderdao.atmSimulator(amount, type, pin);
	}

	@Override
	public boolean beneficiaryDetail(BenificiaryDetail benificiary) throws BenificiaryDetailException {
		return accountholderdao.beneficiaryDetail(benificiary);
	}

	@Override
	public boolean transfer(String senderName, long accountNumber, double amount, int password) {
		return accountholderdao.transfer(senderName, accountNumber, amount, password);
	}

	@Override
	public void display() {
		accountholderdao.display();
		
	}

}
