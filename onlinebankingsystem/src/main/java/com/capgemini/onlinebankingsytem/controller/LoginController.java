package com.capgemini.onlinebankingsytem.controller;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.onlinebankingsytem.bean.AccountHolderLogin;
import com.capgemini.onlinebankingsytem.bean.BankAdmin;
import com.capgemini.onlinebankingsytem.factory.LoginFactory;
import com.capgemini.onlinebankingsytem.service.LoginService;

public class LoginController {
	
	static Logger log = LogManager.getLogger(LoginController.class);
	public static void main(String[] args) {
		
		LoginService service = LoginFactory.getLoginService();
		
		Scanner scanner = new Scanner(System.in);
		
				log.info("Enter your choice: \n 1.Admin Login \n 2.User Login");
				int key = scanner.nextInt();
				switch (key) {
				case 1:
					log.info("Enter the Username");
					String username=scanner.next();
					log.info("Enter the Password");
					String password=scanner.next();

					try {
						BankAdmin bankAdmin= service.admin(username, password);
					} catch(Exception e) {
						log.info("Invalid Credentials");
					}
					break;
					
				case 2:
					log.info("Enter the Username");
					String userName=scanner.next();
					log.info("Enter the Password");
					String password1=scanner.next();

					try {
						AccountHolderLogin user = service.user(userName, password1);
					} catch(Exception e) {
						log.info("Invalid Credentials");
					}
					break;
					
				}
			scanner.close();
	}

}
