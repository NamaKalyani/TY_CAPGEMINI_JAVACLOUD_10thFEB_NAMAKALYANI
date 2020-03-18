package com.capgemini.onlinebankingsytem.service;

import com.capgemini.onlinebankingsytem.bean.ATMSimulator;

public interface ATMService {
	ATMSimulator atm(String type, double amount, Object pin);

}
