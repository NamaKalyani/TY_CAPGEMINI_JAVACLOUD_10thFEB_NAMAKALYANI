package com.capgemini.onlinebankingsytem.factory;

import com.capgemini.onlinebankingsytem.dao.AccountHolderDAO;
import com.capgemini.onlinebankingsytem.dao.AccountHolderDAOImpl;
import com.capgemini.onlinebankingsytem.repository.DataBase;
import com.capgemini.onlinebankingsytem.service.AccountHolderService;
import com.capgemini.onlinebankingsytem.service.AccountHolderServiceImpl;

public class AccountHolderFactory {

	public static AccountHolderDAO getAccountHolderDAO() {

		return new AccountHolderDAOImpl();
	}

	public static AccountHolderService getAccountHolderService() {

		return new AccountHolderServiceImpl();
	}

	public static DataBase getDataBaseDetails() {
		return new DataBase();

	}
}
