package com.capgemini.onlinebankingsytem.dao;

import com.capgemini.onlinebankingsytem.bean.ATMSimulator;

public interface ATMDAO {
	
	ATMSimulator atm(String type, double amount, Object pin);

}

