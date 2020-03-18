package com.capgemini.onlinebankingsytem.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.onlinebankingsytem.bean.ATMSimulator;
import com.capgemini.onlinebankingsytem.repository.AccounHolderDetails;

public class AtmSimulatorController {
	
	Logger log = LogManager.getLogger(AtmSimulatorController.class);
	
	public void atmSimulator() {
		List<ATMSimulator> list = new ArrayList<ATMSimulator>();

		Scanner scanner = new Scanner(System.in);
		log.info("Enter Amount:");
		double amount = scanner.nextDouble();
		log.info("Enter the type: \n debit card \n credit card");
		String cardtype = scanner.next();
		switch (cardtype) {
		case "debitcard":
			log.info("ok");
			break;
		case "creditcard":
			log.info("ok");
			break;
		default:
			log.info("wrong type");
		}
		log.info("Enter Pin:");
		Object pin = scanner.nextInt();	
		AccounHolderDetails.atmlogin();
		for (int i = 0; i < AccounHolderDetails.atm.size(); i++) {
			if((pin.equals(AccounHolderDetails.atm.get(i).get("pin")))
					&& ((cardtype.equals(AccounHolderDetails.atm.get(i).get("cardtype")))
							|| (cardtype.equals(AccounHolderDetails.atm.get(i).get("cardtype1")))
							)) {
				log.info("Transaction Successful.......!!!!");
		} else {
			   log.info("Transaction failed");
		
		}
	}
		scanner.close();
	}

	public static void main(String[] args) {
		AtmSimulatorController atm = new AtmSimulatorController();
		atm.atmSimulator();
	}

}
