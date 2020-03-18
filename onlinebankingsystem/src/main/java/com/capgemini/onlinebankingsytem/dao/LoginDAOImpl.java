package com.capgemini.onlinebankingsytem.dao;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.onlinebankingsytem.bean.AccountHolderLogin;
import com.capgemini.onlinebankingsytem.bean.BankAdmin;
import com.capgemini.onlinebankingsytem.controller.LoginController;
import com.capgemini.onlinebankingsytem.exception.LoginException;
import com.capgemini.onlinebankingsytem.repository.AccounHolderDetails;

public class LoginDAOImpl implements LoginDAO {
	
	Logger log = LogManager.getLogger(LoginController.class);

	@SuppressWarnings("unused")
	@Override
	public BankAdmin admin(String userName, String password) throws LoginException {
		AccounHolderDetails.adminlogin();
		for (int i = 0; i < AccounHolderDetails.admin.size(); i++) {
			if (userName.equalsIgnoreCase((String) AccounHolderDetails.admin.get(i).get("username"))
					&& password.equals(AccounHolderDetails.admin.get(i).get("password"))) {

				log.info("WelCome Admin" + " " + userName + ".......!!");
			} 
			throw new LoginException("Invalid username or password");
			}
		return null;
	}

	@Override
	public AccountHolderLogin user(String username, String password) throws LoginException {
		AccounHolderDetails.users();
		int n=0;
		for (int j = 0; j < AccounHolderDetails.userList.size(); j++) {
			if ((username.equals(AccounHolderDetails.userList.get(j).get("username")))
					&& password.equals(AccounHolderDetails.userList.get(j).get("password"))) {
				n++;
			}
			if(n>0) {
				log.info("Welcome" + username);
				log.info("AccountNo:6666666666666");
				log.info("Balance(INR):2,515");
				log.info("You have 1 beneficiaries");
			}
			else {
				throw new LoginException("Invalid name or password");
			}
			
		}
		return null;
	}

}
