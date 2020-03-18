package com.capgemini.onlinebankingsytem.dao;

import com.capgemini.onlinebankingsytem.bean.AccountHolderLogin;
import com.capgemini.onlinebankingsytem.bean.BankAdmin;
import com.capgemini.onlinebankingsytem.exception.LoginException;

public interface LoginDAO {
	
	BankAdmin admin(String uname,String password) throws LoginException;
	AccountHolderLogin user(String  usrname, String password) throws LoginException;
	

}
