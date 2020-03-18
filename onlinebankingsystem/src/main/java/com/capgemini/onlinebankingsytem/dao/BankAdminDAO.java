package com.capgemini.onlinebankingsytem.dao;

public interface BankAdminDAO {

	public void login(String userName, String password);

	public void addCustomerDetails(String firstName, String lastName, String gender, String dateofBirth,
			long adharNumber, String email, long phoneNumber, String address, String bankBranch, long accountNumber,
			double openingBalance, int pin, String userName, String password);

	public void editCustomerDetails(String firstName, String lastName, double balance, String dateofBirth,
			long adharNumber, String address, String bankBranch, long accountNumber, String userName, String password);

	public void viewCustomerDetails(String name);

	public void postNews(String newsHeadline, String details);

}
