package com.capgemini.onlinebankingsytem.service;

import com.capgemini.onlinebankingsytem.bean.AccountHolderLogin;
import com.capgemini.onlinebankingsytem.bean.BankAdmin;
import com.capgemini.onlinebankingsytem.exception.LoginException;

public interface LoginService {
	BankAdmin admin(String userNameame,String password) throws LoginException;
	AccountHolderLogin user(String  userName, String password) throws LoginException;

}
