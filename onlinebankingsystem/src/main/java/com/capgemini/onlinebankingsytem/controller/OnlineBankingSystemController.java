package com.capgemini.onlinebankingsytem.controller;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.onlinebankingsytem.bean.ATMSimulator;
import com.capgemini.onlinebankingsytem.bean.AccountHolder;
import com.capgemini.onlinebankingsytem.bean.AccountHolderLogin;
import com.capgemini.onlinebankingsytem.bean.BenificiaryDetail;
import com.capgemini.onlinebankingsytem.exception.ATMException;
import com.capgemini.onlinebankingsytem.exception.BenificiaryDetailException;
import com.capgemini.onlinebankingsytem.exception.LoginException;
import com.capgemini.onlinebankingsytem.exception.MessageException;
import com.capgemini.onlinebankingsytem.factory.AccountHolderFactory;
import com.capgemini.onlinebankingsytem.factory.BankAdminFactory;
import com.capgemini.onlinebankingsytem.service.AccountHolderService;
import com.capgemini.onlinebankingsytem.service.BankAdminService;

public class OnlineBankingSystemController {

	static Logger log = LogManager.getLogger(OnlineBankingSystemController.class);

	public static void main(String[] args) throws LoginException, BenificiaryDetailException {
		doBank();
	}

	public static void doBank() throws LoginException, BenificiaryDetailException {

		boolean flag = false;

		Scanner scanner = new Scanner(System.in);
		do {
			log.info("Press 1 for BakAdmin Login Page");
			log.info("Press 2 for AccountHolder Login Page");

			int s = scanner.nextInt();

			switch (s) {
			case 1:
				BankAdminService bankAdminService = BankAdminFactory.getBankAdminService();

				do {
					log.info("press 1 to Bank admin login");
					log.info("press 2 to exit");
					int key = scanner.nextInt();
					int i = 0;
					switch (key) {
					case 1:
						log.info("Enter the UserName");
						String userName = scanner.next();
						log.info("Enter the Password");
						String password = scanner.next();
						try {
							bankAdminService.adminLogin(userName, password);
							log.info("Bank Admin Successfully Login");
							i++;
						} catch (LoginException e) {
							log.error(e);
						}
						if (i > 0) {
							do {
								log.info("Press 1 to Add the Customers");
								log.info("press 2 to update the customer details");

								int k1 = scanner.nextInt();
								switch (k1) {
								case 1:
									Scanner scanner1 = new Scanner(System.in);
									log.info("Enter the First name:");
									String firstName = scanner1.nextLine();
									log.info("Enter the Last name:");
									String lastName = scanner1.nextLine();
									log.info("Enter the Gender:");
									String gender = scanner1.nextLine();
									log.info("Enter the date of birth:");
									String dateOfBirth = scanner1.next();
									log.info("Enter the AadharNumber:");
									long adharNumber = scanner1.nextLong();
									log.info("Enter email address:");
									String emailId = scanner1.next();
									log.info("Enter the PhoneNumber:");
									String phoneNumber = scanner1.next();
									log.info("Enter the Address:");
									String address = scanner1.next();
									log.info("Enter your AccountNumber:");
									long accountNumber = scanner1.nextLong();
									log.info("Enter OpeningBalance Amount:");
									double openingBalance = scanner1.nextDouble();
									log.info("Enter the pin:");
									int pin = scanner1.nextInt();
									log.info("Enter the User name");
									String username = scanner1.next();
									log.info("Enter the Password");
									String passWord = scanner1.next();
									log.info("Enter the Bank Branch name:");
									String bankBranch = scanner1.next();
									log.info("Enter the customer id");
									int custId = scanner1.nextInt();

									AccountHolder accountHolder = new AccountHolder();

									accountHolder.setFirstName(firstName);
									accountHolder.setLastName(lastName);
									accountHolder.setgender(gender);
									accountHolder.setDateOfBirth(dateOfBirth);
									accountHolder.setAdharNumber(adharNumber);
									accountHolder.setEmailId(emailId);
									accountHolder.setPhoneNumber(phoneNumber);
									accountHolder.setaddress(address);
									accountHolder.setAccountNumber(accountNumber);
									accountHolder.setOpeningBalance(openingBalance);
									accountHolder.setpin(pin);
									accountHolder.setUserName(userName);
									accountHolder.setpassword(password);
									accountHolder.setBankBranch(bankBranch);
									accountHolder.setCustId(custId);

									boolean check = bankAdminService.addCustomer(accountHolder);

									break;
								case 2:
									Scanner scanner2 = new Scanner(System.in);
									AccountHolder accountHolderDetails = new AccountHolder();
									log.info("Enter the custid of the customer to edit");
									int editCustId = scanner2.nextInt();
									AccountHolder accountholder = bankAdminService.findCustomerByCustID(editCustId);
									if (accountholder != null) {
										log.info("enter the FirstName");
										String firstName1 = scanner2.next();
										accountholder.setFirstName(firstName1);
										log.info("enter the LastName");
										String lastname1 = scanner2.next();
										accountholder.setLastName(lastname1);
										log.info("enter the Gender");
										String gender1 = scanner2.next();
										accountholder.setgender(gender1);
										log.info("enter Date of Birth");
										String dateOfBirth1 = scanner2.next();
										accountholder.setDateOfBirth(dateOfBirth1);
										log.info("enter AadharNumber");
										long adharNumber1 = scanner2.nextLong();
										accountholder.setAdharNumber(adharNumber1);
										log.info("enter emailid");
										String emailId1 = scanner2.next();
										accountholder.setEmailId(emailId1);
										log.info("enter the PhoneNumber");
										String phoneNumber1 = scanner2.next();
										accountholder.setPhoneNumber(phoneNumber1);
										log.info("enter the address");
										String address1 = scanner2.next();
										accountholder.setaddress(address1);
										log.info("enter the Bank Branch");
										String branch1 = scanner2.next();
										accountholder.setBankBranch(branch1);
										log.info("enter the AccountNumber");
										long accountNumber1 = scanner2.nextLong();
										accountholder.setAccountNumber(accountNumber1);
										log.info("enter the OpeningBalance");
										double openingBalance1 = scanner2.nextDouble();
										accountholder.setOpeningBalance(openingBalance1);
										log.info("enter pin");
										int pin1 = scanner2.nextInt();
										accountholder.setpin(pin1);
										log.info("enter the UserName:");
										String userName1 = scanner2.next();
										accountholder.setUserName(userName);
										log.info("enter password:");
										String accountholderpassword = scanner2.next();
										accountholder.setpassword(accountholderpassword);

										bankAdminService.updateCustomer(accountholder);
									} else
										throw new MessageException("Not updated");

									break;

								default:
									log.info("Invalid choice");
									break;
								}
							} while (true);
						}
					case 2:
						doBank();
						break;
					default:
						log.info("Invalid Choice");
						break;

					}
				} while (true);

			case 2:
				AccountHolderService accountHolderService = AccountHolderFactory.getAccountHolderService();

				do {
					log.info("Press 1 to Account Holder Login");
					log.info("Press 2 to Know the Account Details");
					int option = scanner.nextInt();

					switch (option) {
					case 1:
						log.info("Enter the UserName");
						String username = scanner.next();
						log.info("Enter the Password");
						String password = scanner.next();

						int j = 0;

						try {
							AccountHolderLogin accountholderLogin = accountHolderService.userLogin(username, password);
							log.info("Successfully Login");
							j++;
						} catch (LoginException e) {
							log.error(e);
						}

						if (j > 0) {
							do {
								log.info("Press 1 to ATM Simulator");
								log.info("press 2 to beneficiary datails");
								log.info("press 3 to transaction");
								log.info("press 4 to view customer details");
								int option1 = scanner.nextInt();

								switch (option1) {
								case 1:
									log.info("Enter the Pin:");
									int pin = scanner.nextInt();
									log.info("Enter the Amount:");
									double amount = scanner.nextDouble();
									log.info("Enter the type: \n debit \n credit");
									String cardtype = scanner.next();
									try {
										ATMSimulator atmSimulator = accountHolderService.atmSimulator(amount, cardtype,
												pin);
									} catch (ATMException e) {
										log.error(e);
									}
									break;

								case 2:
									Scanner scanner3 = new Scanner(System.in);
									BenificiaryDetail beneficiaryDetail = new BenificiaryDetail();
									log.info("enter first name");
									String firstName = scanner3.next();
									beneficiaryDetail.setfirstname(firstName);
									log.info("enter last name");
									String lastName = scanner3.next();
									beneficiaryDetail.setlastName(lastName);
									log.info("enter account number");
									long accountNumber = scanner3.nextLong();
									beneficiaryDetail.setaccountnumber(accountNumber);
									log.info("enter email id");
									String emailId = scanner3.next();
									beneficiaryDetail.setemailid(emailId);
									log.info("enter the Phone number");
									String phoneNumber = scanner3.next();
									beneficiaryDetail.setphonenumber(phoneNumber);
									try {
										boolean result = accountHolderService.beneficiaryDetail(beneficiaryDetail);
									} catch (BenificiaryDetailException e) {
										log.error(e);
									}
									break;

								case 3:
									System.out.println("enter the sender name");
									String senderName = scanner.next();
									System.out.println("enter the account number");
									long accountNo1 = scanner.nextLong();
									System.out.println("enter the amount");
									double amount1 = scanner.nextDouble();
									System.out.println("enter the password");
									int password1 = scanner.nextInt();
									try {
										boolean success = accountHolderService.transfer(senderName, accountNo1, amount1,
												password1);
									} catch (BenificiaryDetailException e) {
										log.error(e);
									}
									break;

								case 4:
									accountHolderService.display();
									break;

								default:
									log.info("Invalid Choice");
									break;
								}
							} while (true);
						}

					case 2:
						doBank();
						break;
					}
				} while (true);

			default:
				log.info("Invalid Choice");
				break;
			}
		} while (flag);
		scanner.close();
	}

}
