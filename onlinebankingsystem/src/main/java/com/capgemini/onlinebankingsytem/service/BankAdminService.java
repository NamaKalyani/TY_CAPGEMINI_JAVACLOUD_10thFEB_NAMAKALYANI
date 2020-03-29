package com.capgemini.onlinebankingsytem.service;

import com.capgemini.onlinebankingsytem.bean.AccountHolder;
import com.capgemini.onlinebankingsytem.bean.BankAdmin;
import com.capgemini.onlinebankingsytem.exception.LoginException;

public interface BankAdminService {

	BankAdmin adminLogin(String userName, String password) throws LoginException;

	AccountHolder findCustomerByCustID(int custId);

	public boolean addCustomer(AccountHolder customer);

	public void updateCustomer(AccountHolder customer);
}
