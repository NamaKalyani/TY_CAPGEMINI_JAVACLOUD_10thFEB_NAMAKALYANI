
package com.capgemini.onlinebankingsytem.controller;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.onlinebankingsytem.bean.BenificiaryDetail;

public class BenificiaryController {
	
	Logger log = LogManager.getLogger(BenificiaryController.class);
	
	public void sendto() {
		ArrayList<BenificiaryDetail>list = new ArrayList<BenificiaryDetail>();
		Scanner scanner = new Scanner(System.in);
		log.info("Enter the First Name");
		String firstName = scanner.nextLine();
		log.info("Enter the Last Name");
		String lastName = scanner.nextLine();
		log.info("Enter the Account Number");
		long accountNumber = scanner.nextLong();
		log.info("Enter the Email-Id");
		String email = scanner.nextLine();
		log.info("Enter the Phone Number");
		long phoneNumber = scanner.nextLong();
	}
	public void addordelete(){
		
	}
	public static void main(String[] args) {
		BenificiaryController benificiary = new BenificiaryController();
		benificiary.sendto();
	}

}
