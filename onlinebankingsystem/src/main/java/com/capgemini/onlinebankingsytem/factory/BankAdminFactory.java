package com.capgemini.onlinebankingsytem.factory;

import com.capgemini.onlinebankingsytem.dao.BankAdminDAO;
import com.capgemini.onlinebankingsytem.dao.BankAdminDAOImpl;
import com.capgemini.onlinebankingsytem.repository.DataBase;
import com.capgemini.onlinebankingsytem.service.BankAdminService;
import com.capgemini.onlinebankingsytem.service.BankAdminServiceImpl;

public class BankAdminFactory {

	public static BankAdminDAO getBankAdmin() {
		return new BankAdminDAOImpl();
	}

	public static BankAdminService getBankAdminService() {
		return new BankAdminServiceImpl();
	}

	public static DataBase getDataBaseDetails() {
		return new DataBase();
	}

}
