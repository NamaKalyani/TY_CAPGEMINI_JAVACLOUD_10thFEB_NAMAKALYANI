package com.capgemini.onlinebankingsytem.service;

import com.capgemini.onlinebankingsytem.bean.AccountHolderLogin;
import com.capgemini.onlinebankingsytem.bean.BankAdmin;
import com.capgemini.onlinebankingsytem.dao.LoginDAO;
import com.capgemini.onlinebankingsytem.exception.LoginException;
import com.capgemini.onlinebankingsytem.factory.LoginFactory;

public class LoginServiceImpl implements LoginService {
	

	private LoginDAO dao = LoginFactory.getLoginDAO();

	@Override
	public BankAdmin admin(String userName, String password) throws LoginException {
		return dao.admin(userName, password);
	}

	@Override
	public AccountHolderLogin user(String userName, String password) throws LoginException {
		return dao.user(userName, password);
	}

}
