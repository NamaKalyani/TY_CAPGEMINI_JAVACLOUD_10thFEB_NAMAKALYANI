package com.capgemini.onlinebankingsytem.factory;

import com.capgemini.onlinebankingsytem.dao.ATMDAO;
import com.capgemini.onlinebankingsytem.dao.ATMDAOImpl;
import com.capgemini.onlinebankingsytem.service.ATMService;
import com.capgemini.onlinebankingsytem.service.ATMServiceImpl;

public class ATMFactory {
	
	public static ATMDAO getAtmDAO() {

		return new ATMDAOImpl();
	}
	public static ATMService getAtmService() {
		
		return new ATMServiceImpl();
		
	}

}
