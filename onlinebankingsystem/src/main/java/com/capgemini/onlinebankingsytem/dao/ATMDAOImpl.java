package com.capgemini.onlinebankingsytem.dao;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.onlinebankingsytem.bean.ATMSimulator;
import com.capgemini.onlinebankingsytem.exception.ATMException;
import com.capgemini.onlinebankingsytem.repository.AccounHolderDetails;

public class ATMDAOImpl implements ATMDAO{
	
	Logger log = LogManager.getLogger(ATMDAOImpl.class);

	@Override
	public ATMSimulator atm(String type, double amount, Object pin) {
		AccounHolderDetails.atmlogin();
		AccounHolderDetails.users();
		int n = 0;
		double amt = 0;
		for (int i = 0; i < AccounHolderDetails.atm.size(); i++) {
			for (int j = 0; j < AccounHolderDetails.userList.size(); j++) {

				if ((pin.equals(AccounHolderDetails.userList.get(j).get("pin")))
						&& ((type.equals(AccounHolderDetails.atm.get(i).get("cardtype")))
								|| (type.equals(AccounHolderDetails.atm.get(i).get("cardtype1"))))) {

					amt = (double) AccounHolderDetails.userList.get(j).get("openingBalance");

					if (amount > amt) {
						log.info("you don't have sufficient balance in your account");
						log.info("you have" + " " + amt+"Rupees only in your Account");
					} else {
						amount = amt - amount;
						n++;
					}
				}
			}
		}
		if (n > 0) {
			log.info("Transaction Successful.......!!!!");
			log.info("Remaining balance in your account is"+" "+ amount +"Rupees");
		} else {
			throw new ATMException("Invalid credentials");

		}
		return null;
	}
	}

	
	

	
	


