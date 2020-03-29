package com.capgemini.onlinebankingsytem.bean;

public class AccountHolder  {
	
	private String firstName;
	private String lastName;
	private String gender;
	private String dateOfBirth;
	private  long adharNumber;
	private String emailId;
	private String phoneNumber;
	private String address;
	private String bankBranch;
	private long accountNumber;
	private double openingBalance;
	private int pin;
	private String userName;
	private String password;
	private int custId;
	private int transPin;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public long getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}
	
	public String getEmilId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	
	public String getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(double openingBalanace) {
		this.openingBalance = openingBalance;
	}
	
	public int getpin() {
		return pin;
	}
	public void setpin(int pin) {
		this.pin = pin;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getTransPin() {
		return transPin;
	}

	public void setTransPin(int transPin) {
		this.transPin = transPin;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", dateofbirth="
				+ dateOfBirth + ", adharNumber=" + adharNumber + ", emailId=" + emailId + ", phoneNumber=" + phoneNumber + ", address="
				+ address + ", accountNumber=" + accountNumber + ", openingBalance=" + openingBalance + ", pin=" + pin
				+ ", userName=" + userName + ", password=" + password + ", bankBranch=" + bankBranch + ", custId=" + custId
				+ "]";
	}
	
	
	


}
