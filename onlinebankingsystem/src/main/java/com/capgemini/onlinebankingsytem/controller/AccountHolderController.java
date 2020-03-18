package com.capgemini.onlinebankingsytem.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.onlinebankingsytem.bean.AccountHolder;

public class AccountHolderController {
	
	Logger log = LogManager.getLogger(AccountHolderController.class);
	
	public void getCustomerDetails() {
		List<AccountHolder> list = new ArrayList<AccountHolder>();
		Scanner scanner = new Scanner(System.in);
		log.info("Enter the First Name:");
		String firstName = scanner.nextLine();
		log.info("Enter the Last Name:");
		String lastName = scanner.nextLine();
		log.info("Enter the Gender:");
		String gender = scanner.nextLine();
		log.info("Enter the date of birth:");
		String dateOfBirth = scanner.next();
		log.info("Enter the Aadhar number:");
		long adharNumber = scanner.nextLong();
		log.info("Enter email address:");
		String email = scanner.next();
		log.info("Enter the Mobile number:");
		long mobileNumber = scanner.nextLong();
		log.info("Enter the Address:");
		String address = scanner.next();
		log.info("Enter your Account number:");
		long accountNumber = scanner.nextLong();
		log.info("Enter OpeningBalance Amount:");
		double openingBalance = scanner.nextDouble();
		log.info("Enter the pin:");
		int Pin = scanner.nextInt();
		log.info("Enter the User name");
		String userName = scanner.next();
		log.info("Enter the Password");
		String password = scanner.next();
		log.info("Enter the Branch name:");
		String branchName = scanner.next();
		
	}

	public static void main(String[] args) {
		AccountHolderController holder1= new AccountHolderController();
		holder1.getCustomerDetails();
	}

}
