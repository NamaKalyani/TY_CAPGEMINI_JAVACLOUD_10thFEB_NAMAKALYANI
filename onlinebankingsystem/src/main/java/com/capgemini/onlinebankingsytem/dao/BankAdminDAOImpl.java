package com.capgemini.onlinebankingsytem.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.onlinebankingsytem.bean.AccountHolder;
import com.capgemini.onlinebankingsytem.bean.BankAdmin;
import com.capgemini.onlinebankingsytem.exception.LoginException;
import com.capgemini.onlinebankingsytem.exception.MessageException;
import com.capgemini.onlinebankingsytem.factory.AccountHolderFactory;
import com.capgemini.onlinebankingsytem.factory.BankAdminFactory;
import com.capgemini.onlinebankingsytem.repository.DataBase;
import com.capgemini.onlinebankingsytem.repository.DataBase;
import com.capgemini.onlinebankingsytem.validation.BankValidation;

public class BankAdminDAOImpl implements BankAdminDAO {

	static Logger log = LogManager.getLogger(BankAdminDAOImpl.class);

	@Override
	public BankAdmin adminLogin(String userName, String password) throws LoginException {
		BankValidation validation = new BankValidation();
		validation.validatedName(userName);
		validation.validatedPassword(password);
		BankAdmin admin = new BankAdmin(userName, password);
		admin.setuserName(userName);
		admin.setPassword(password);

		DataBase database = AccountHolderFactory.getDataBaseDetails();
		DataBase.bankAdminLogin();
		List<BankAdmin> adminDetails = DataBase.bankAdmin;
		for (BankAdmin admin1 : adminDetails) {
			if (admin1.getuserName().equalsIgnoreCase(admin.getuserName())
					&& admin1.getPassword().equals(admin.getPassword())) {

				log.info("Welcome Admin" + " " + admin1.getuserName());
			} else
				throw new LoginException("Invalid username or password");

		}
		return null;
	}

	@Override
	public AccountHolder findCustomerByCustID(int custId) {
		DataBase database = BankAdminFactory.getDataBaseDetails();
		DataBase.customers();
		List<AccountHolder> usersList = DataBase.accountHolderList;
		AccountHolder accountHolder = null;
		if (usersList.size() > 0) {
			for (AccountHolder customer : usersList) {
				if (customer.getCustId() == custId) {
					accountHolder = customer;
				}
			}
		}
		return accountHolder;
	}

	@Override
	public boolean addCustomer(AccountHolder customer) {

		BankValidation validation = new BankValidation();
		validation.validatedName(customer.getFirstName());
		validation.validatedName(customer.getLastName());
		validation.validatedEmail(customer.getEmilId());
		validation.validatedPhoneNumber(customer.getPhoneNumber());
		validation.validatedAadhar(customer.getAdharNumber());

		DataBase database = BankAdminFactory.getDataBaseDetails();
		AccountHolder accountHolder = new AccountHolder();
		DataBase.customers();
		List<AccountHolder> usersList = DataBase.accountHolderList;
		for (AccountHolder customer1 : usersList) {
			boolean addCustomer = ((customer1.getFirstName().equals(customer.getFirstName()))
					&& (customer1.getLastName().equals(customer.getLastName()))
					&& (customer1.getgender().equals(customer.getgender()))
					&& (customer1.getDateOfBirth().equals(customer.getDateOfBirth()))
					&& (customer1.getAdharNumber() == customer.getAdharNumber())
					&& (customer1.getEmilId().equals(customer.getEmilId()))
					&& (customer1.getPhoneNumber() == customer.getPhoneNumber())
					&& (customer1.getaddress().equalsIgnoreCase(customer.getaddress()))
					&& (customer1.getBankBranch().equals(customer.getBankBranch()))
					&& (customer1.getAccountNumber() == customer.getAccountNumber())
					&& (customer1.getOpeningBalance() == customer.getOpeningBalance())
					&& (customer1.getpin() == customer.getpin())
					&& (customer1.getUserName().equals(customer.getUserName()))
					&& (customer1.getpassword().equals(customer.getpassword()))
					&& (customer1.getCustId() == (customer.getCustId())));

			if (addCustomer == true) {
				log.info("Added Successfully");
			} else
				throw new MessageException("The details of the customer is not added");
		}
		return false;
	}

	@Override
	public void updateCustomer(AccountHolder customer1) {
		DataBase database = BankAdminFactory.getDataBaseDetails();
		DataBase.customers();
		List<AccountHolder> usersList = DataBase.accountHolderList;
		if (usersList.size() > 0) {
			for (AccountHolder customer2 : usersList) {
				if (customer2.getCustId() == customer1.getCustId()) {
					usersList.remove(customer2);
					usersList.add(customer1);
				}
			}
			for (AccountHolder customer2 : usersList) {
				log.info("Customerdetails updated");
			}
		}

	}

}
