package com.capgemini.onlinebankingsytem.service;

import com.capgemini.onlinebankingsytem.bean.AccountHolder;
import com.capgemini.onlinebankingsytem.bean.BankAdmin;
import com.capgemini.onlinebankingsytem.dao.BankAdminDAO;
import com.capgemini.onlinebankingsytem.exception.LoginException;
import com.capgemini.onlinebankingsytem.factory.BankAdminFactory;

public class BankAdminServiceImpl implements BankAdminService {
	
	private BankAdminDAO bankadmindao = BankAdminFactory.getBankAdmin();

	@Override
	public BankAdmin adminLogin(String userName, String password) throws LoginException {
		return bankadmindao.adminLogin(userName, password);
	}

	@Override
	public AccountHolder findCustomerByCustID(int custId) {
		return bankadmindao.findCustomerByCustID(custId);
	}

	@Override
	public boolean addCustomer(AccountHolder customer) {
		return bankadmindao.addCustomer(customer);
	}

	@Override
	public void updateCustomer(AccountHolder customer) {
		bankadmindao.updateCustomer(customer);
	}
	

}
