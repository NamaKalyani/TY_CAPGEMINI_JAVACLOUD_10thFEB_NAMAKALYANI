package com.capgemini.onlinebankingsytem.service;

import com.capgemini.onlinebankingsytem.bean.ATMSimulator;
import com.capgemini.onlinebankingsytem.dao.ATMDAO;
import com.capgemini.onlinebankingsytem.factory.ATMFactory;

public class ATMServiceImpl implements ATMService {

	private ATMDAO dao = ATMFactory.getAtmDAO();

	@Override
	public ATMSimulator atm(String type, double amount, Object pin) {

		return dao.atm(type, amount, pin);
		
	}

}
