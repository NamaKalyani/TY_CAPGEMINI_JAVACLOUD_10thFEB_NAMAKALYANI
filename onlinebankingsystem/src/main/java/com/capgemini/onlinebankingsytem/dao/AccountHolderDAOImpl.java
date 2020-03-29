package com.capgemini.onlinebankingsytem.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.onlinebankingsytem.bean.ATMSimulator;
import com.capgemini.onlinebankingsytem.bean.AccountHolder;
import com.capgemini.onlinebankingsytem.bean.AccountHolderLogin;
import com.capgemini.onlinebankingsytem.bean.BenificiaryDetail;
import com.capgemini.onlinebankingsytem.bean.Transaction;
import com.capgemini.onlinebankingsytem.exception.ATMException;
import com.capgemini.onlinebankingsytem.exception.BenificiaryDetailException;
import com.capgemini.onlinebankingsytem.exception.LoginException;
import com.capgemini.onlinebankingsytem.factory.AccountHolderFactory;
import com.capgemini.onlinebankingsytem.repository.DataBase;
import com.capgemini.onlinebankingsytem.repository.DataBase;
import com.capgemini.onlinebankingsytem.validation.BankValidation;

public class AccountHolderDAOImpl implements AccountHolderDAO {

	static Logger log = LogManager.getLogger(AccountHolderDAOImpl.class);

	@Override
	public AccountHolderLogin customerLogin(String userName, String password) throws LoginException {
		AccountHolderLogin user = new AccountHolderLogin();
		user.setUserName(userName);
		user.setpassword(password);

		BankValidation validation = new BankValidation();
		validation.validatedName(userName);
		validation.validatedPassword(password);

		DataBase database = AccountHolderFactory.getDataBaseDetails();
		DataBase.customers();
		int k = 0;
		List<AccountHolder> userbean = DataBase.accountHolderList;
		for (AccountHolder customer : userbean) {
			if (customer.getUserName().equalsIgnoreCase(user.getUserName())
					&& customer.getpassword().equals(user.getpassword())) {

				k++;
			}
		}
		if (k > 0) {
			log.info("Welcome Customer" + " " + user.getUserName() + "!!");
		} else
			throw new LoginException("Invalid username or passord");

		return null;
	}

	@Override
	public ATMSimulator atmSimulator(double amount, String type, int pin) {
		ATMSimulator atm = new ATMSimulator();
		atm.setamount(amount);
		atm.settype(type);
		atm.setpin(pin);

		DataBase database = AccountHolderFactory.getDataBaseDetails();
		DataBase.bankAdminLogin();
		DataBase.customers();
		double amt = 0;
		int k = 0;
		List<AccountHolder> customerdetails = DataBase.accountHolderList;
		for (AccountHolder customer : customerdetails) {
			if (customer.getpin() == atm.getpin()) {
				amt = customer.getOpeningBalance();
			}
		}
		if (amount > amt) {
			log.info("No sufficient balance in your account");
			log.info("you have" + " " + amt + "Rupees only in your Account");
		} else
			k++;
		if (k > 0) {
			log.info(atm.gettype() + "ed" + " " + "successfully");
		} else
			throw new ATMException("Invalid credentials");
		return null;
	}

	@Override
	public boolean beneficiaryDetail(BenificiaryDetail benificiary) throws BenificiaryDetailException {
		BenificiaryDetail benificiary1 = new BenificiaryDetail();

		BankValidation validation = new BankValidation();
		validation.validatedEmail(benificiary.getemailid());
		validation.validatedPhoneNumber(benificiary.getphonenumber());

		DataBase database = AccountHolderFactory.getDataBaseDetails();
		DataBase.beneficiaryDetails();
		int k = 0;
		List<BenificiaryDetail> beneficiaries = DataBase.benificiaryList;
		for (BenificiaryDetail beneficiary : beneficiaries) {
			if ((benificiary.getfirstName().equals(benificiary.getfirstName()))
					&& (beneficiary.getlastname().equals(benificiary.getlastname()))
					&& (benificiary.getemailid().equals(benificiary.getemailid()))
//					&& (benificiary.getphonenumber().equals(benificiary.getphonenumber())))
					&& (benificiary.getaccountnumber() == benificiary.getaccountnumber())) {

				k++;
			}
		}
		if (k > 0) {
			log.info("you have beneficiary press 4 to transfer");
		} else
			throw new BenificiaryDetailException("Invalid credentials");

		return false;
	}

	@Override
	public boolean transfer(String senderName, long accountNumber, double amount, int password) {
		BankValidation validationCustomer = new BankValidation();
		validationCustomer.validatedtransId(password);

		Transaction transaction = new Transaction();
		transaction.setSenderName(senderName);
		transaction.setAccountNumber(accountNumber);
		transaction.setAmount(amount);
		transaction.setPassword(password);

		DataBase database = AccountHolderFactory.getDataBaseDetails();
		DataBase.beneficiaryDetails();
		DataBase.customers();
		List<BenificiaryDetail> beneficiaryDetail = DataBase.benificiaryList;
		List<AccountHolder> customer = DataBase.accountHolderList;
		int i = 0;
		for (AccountHolder customer1 : customer) {
			for (BenificiaryDetail benificiary : beneficiaryDetail) {
				if (customer1.getUserName().equalsIgnoreCase(transaction.getSenderName())
						&& customer1.getTransPin() == transaction.getPassword()
						&& (transaction.getAmount() <= customer1.getOpeningBalance())
						&& benificiary.getaccountnumber() == transaction.getAccountNumber()) {

					i++;
				}
			}
		}
		if (i > 0) {
			log.info("Transaction successfull");
		} else
			throw new BenificiaryDetailException("Invalid credentials");

		return false;
	}

	@Override
	public void display() {
		DataBase database = AccountHolderFactory.getDataBaseDetails();

		DataBase.customers();
		List<AccountHolder> userDetail = DataBase.accountHolderList;
		for(AccountHolder customer : userDetail) {
			log.info(customer.getUserName());
		}


	}

}
