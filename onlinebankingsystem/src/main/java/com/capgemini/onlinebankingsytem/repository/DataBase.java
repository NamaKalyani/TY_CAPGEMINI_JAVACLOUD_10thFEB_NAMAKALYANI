package com.capgemini.onlinebankingsytem.repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.capgemini.onlinebankingsytem.bean.AccountHolder;
import com.capgemini.onlinebankingsytem.bean.BankAdmin;
import com.capgemini.onlinebankingsytem.bean.BenificiaryDetail;

public class DataBase {
	
	public static List<BankAdmin>bankAdmin = new ArrayList<BankAdmin>();
	public static LinkedList<AccountHolder>accountHolderList = new LinkedList<AccountHolder>();
	public static LinkedList<BenificiaryDetail>benificiaryList = new LinkedList<BenificiaryDetail>();
	
	public static void customers() {
		AccountHolder accountholder = new AccountHolder();
		accountholder.setFirstName("gopi");
		accountholder.setLastName("paul");
		accountholder.setgender("Male");
		accountholder.setDateOfBirth("1995-05-29");
		accountholder.setAdharNumber(53655859435l);
		accountholder.setEmailId("gopi99@gmail.com");
		accountholder.setPhoneNumber("9165065742");
		accountholder.setpin(6666);
		accountholder.setUserName("GopiPaul");
		accountholder.setpassword("paul@34521");
		accountholder.setOpeningBalance(1500);
		accountholder.setBankBranch("Bangalore");
		accountholder.setCustId(1);
		accountholder.setTransPin(11111);
		accountHolderList.add(accountholder);
		
		AccountHolder accountholder1 = new AccountHolder();
		accountholder1.setFirstName("Kalyani");
		accountholder1.setLastName("Nama");
		accountholder1.setgender("Female");
		accountholder1.setDateOfBirth("1997-11-01");
		accountholder1.setAdharNumber(445042298159l);
		accountholder1.setEmailId("kalyani@gmail.com");
		accountholder1.setPhoneNumber("8096672584");
		accountholder1.setpin(1755);
		accountholder1.setUserName("Nama_Kalyani");
		accountholder1.setpassword("kalyani@01");
		accountholder1.setOpeningBalance(1500);
		accountholder1.setBankBranch("Anantapur");
		accountholder1.setCustId(2);
		accountholder1.setTransPin(11112);
		accountHolderList.add(accountholder1);
		
		AccountHolder accountholder2 = new AccountHolder();
		accountholder2.setFirstName("Nanda");
		accountholder2.setLastName("Kumar");
		accountholder2.setgender("Male");
		accountholder2.setDateOfBirth("1997-06-28");
		accountholder2.setAdharNumber(236547891425l);
		accountholder2.setEmailId("nandakumar@gmail.com");
		accountholder2.setPhoneNumber("9874563210");
		accountholder2.setpin(9696);
		accountholder2.setUserName("NandaKumar");
		accountholder2.setpassword("nanda@1234");
		accountholder2.setOpeningBalance(1500);
		accountholder2.setBankBranch("Chennai");
		accountholder2.setCustId(3);
		accountholder2.setTransPin(11113);
		accountHolderList.add(accountholder2);
		
		AccountHolder accountholder3 = new AccountHolder();
		accountholder3.setFirstName("Sravani");
		accountholder3.setLastName("Somaraju");
		accountholder3.setgender("Female");
		accountholder3.setDateOfBirth("1997-09-29");
		accountholder3.setAdharNumber(987654321654l);
		accountholder3.setEmailId("sravani@gmail.com");
		accountholder3.setPhoneNumber("9876543210");
		accountholder3.setpin(1515);
		accountholder3.setUserName("Sravani");
		accountholder3.setpassword("qwerty");
		accountholder3.setOpeningBalance(1500);
		accountholder3.setBankBranch("Amaravathi");
		accountholder3.setCustId(4);
		accountholder3.setTransPin(11114);
		accountHolderList.add(accountholder3);
		
//		AccountHolder accountholder4 = new AccountHolder();
//		accountholder4.setFirstName("Lokesh");
//		accountholder4.setLastName("B");
//		accountholder4.setgender("Male");
//		accountholder4.setDateOfBirth("1996-8-29");
//		accountholder4.setAdharNumber(213654987456l);
//		accountholder4.setEmailId("lokesh@gmail.com");
//		accountholder4.setPhoneNumber(9875462130l);
//		accountholder4.setpin(1212);
//		accountholder4.setUserName("Lokesh");
//		accountholder4.setpassword("asdfg");
//		accountholder4.setOpeningBalance(1500);
//		accountholder4.setBankBranch("Hyderabad");
//		accountholder4.setCustId(5);
//		accountholder4.setTransPin(11115);
//		accountHolderList.add(accountholder4);
		
	}
	
	public static void bankAdminLogin() {

		BankAdmin bankadmin = new BankAdmin(null, null);
		bankadmin.setuserName("Nama_Kalyani");
		bankadmin.setPassword("Namakalyani@01");
		bankAdmin.add(bankadmin);
	}
	
	public static void beneficiaryDetails() {

		BenificiaryDetail benificiary1 = new BenificiaryDetail();
		benificiary1.setfirstname("Lokesh");
		benificiary1.setlastName("B");
		benificiary1.setaccountnumber(23654789123l);
		benificiary1.setemailid("lokesh@gmail.com");
		benificiary1.setphonenumber("9234567890");
		benificiaryList.add(benificiary1);
		
		BenificiaryDetail benificiary2 = new BenificiaryDetail();
		benificiary1.setfirstname("Deepthi");
		benificiary1.setlastName("Nama");
		benificiary1.setaccountnumber(25698741236l);
		benificiary1.setemailid("deepthi@gmail.com");
		benificiary1.setphonenumber("9632587410");
		benificiaryList.add(benificiary2);
}
}
