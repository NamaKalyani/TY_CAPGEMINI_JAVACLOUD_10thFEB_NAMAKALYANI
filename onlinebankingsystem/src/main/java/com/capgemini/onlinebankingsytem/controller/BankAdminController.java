package com.capgemini.onlinebankingsytem.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.onlinebankingsytem.bean.AccountHolder;

public class BankAdminController {
	
		Logger log = LogManager.getLogger(BankAdminController.class);

	public void addCustomerDetails() {
		List<AccountHolder> list = new ArrayList<AccountHolder>();
		Scanner scanner = new Scanner(System.in);
		log.info("Enter the FirstName:");
		String firstName = scanner.nextLine();
		log.info("Enter the LastName:");
		String lastName = scanner.nextLine();
		log.info("Enter the Gender:");
		String gender = scanner.nextLine();
		log.info("Enter the date of birth:");
		String dateOfBirth = scanner.next();
		log.info("Enter the Aadhar number:");
		long aadharNumber = scanner.nextLong();
		log.info("Enter email address:");
		String email = scanner.next();
		log.info("Enter the Mobile number:");
		long mobileNumber = scanner.nextLong();
		log.info("Enter the Address:");
		String addr = scanner.next();
		log.info("Enter your Account number:");
		long accountNumber = scanner.nextLong();
		log.info("Enter OpeningBalance Amount:");
		double openingBalalane = scanner.nextDouble();
		log.info("Enter the pin:");
		int Pin = scanner.nextInt();
		log.info("Enter the User name");
		String userName = scanner.next();
		log.info("Enter the Password");
		String password = scanner.next();
		log.info("Enter the Branch name:");
		String branchName = scanner.next();
		
	}
	public void editCustomerDetails() {
		
	}
	public void viewCustomerDetails() {
		
	}

	public static void main(String[] args) {
		BankAdminController adminMain = new BankAdminController();
		

}
}