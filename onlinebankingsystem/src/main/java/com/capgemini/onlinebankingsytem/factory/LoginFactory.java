package com.capgemini.onlinebankingsytem.factory;

import com.capgemini.onlinebankingsytem.dao.LoginDAO;
import com.capgemini.onlinebankingsytem.dao.LoginDAOImpl;
import com.capgemini.onlinebankingsytem.service.LoginService;
import com.capgemini.onlinebankingsytem.service.LoginServiceImpl;

public class LoginFactory {
	public static LoginDAO getLoginDAO() {

		return new LoginDAOImpl();
	}
	public static LoginService getLoginService() {
		
		return new LoginServiceImpl();
	}


}
