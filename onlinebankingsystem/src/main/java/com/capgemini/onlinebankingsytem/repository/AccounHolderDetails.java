package com.capgemini.onlinebankingsytem.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.capgemini.onlinebankingsytem.bean.BankAdmin;

public class AccounHolderDetails {
	public static List<HashMap<String, Object>> userList = new ArrayList<HashMap<String, Object>>();
	public static List<HashMap<String, Object>> atm = new ArrayList<HashMap<String, Object>>();
	public static List<HashMap<String, Object>> admin = new ArrayList<HashMap<String, Object>>();
	public static List<HashMap<String, Object>> benificiary = new ArrayList<HashMap<String, Object>>();

	public static void users() {
		HashMap<String, Object> userHashMap1 = new HashMap<String, Object>();
//		Customer customer = new Customer("gopi", "pal", "male", "1995-05-29", 560255859, "BHIL", 9165065742l,
//				"yugeshverma@gmail.com", 6666666666666l, 10515, 6666, "gopi", "gopi199", "NewYork",3);
		userHashMap1.put("firstName", "gopi");
		userHashMap1.put("lastName", "pal");
		userHashMap1.put("gender", "male");
		userHashMap1.put("dateOfBirth", "1995-05-29");
		userHashMap1.put("adharNumber", 560255859);
		userHashMap1.put("email", "yugeshverma@gmail.com");
		userHashMap1.put("mobileNumber", 9165065742l);
		userHashMap1.put("address", "BHIL");
		userHashMap1.put("acountNumber", 6666666666666l);
		userHashMap1.put("openingBalance", 2000.00);
		userHashMap1.put("pin", 6666);
		userHashMap1.put("username", "gopi");
		userHashMap1.put("password", "Gopi@99");
		userHashMap1.put("bankBranch", "NewYork");
		userHashMap1.put("customerId", 1);
		userList.add(userHashMap1);

		HashMap<String, Object> userHashMap2 = new HashMap<String, Object>();
//		Customer customer1 = new Customer("Kalyani", "Nama", "female", "1997-11-01", 258741369, "Anantapur", 8790730294,
//				"kalyani@gmail.com", 6666566666666l, 10515, 6666, "kalyani", "kalyani@97", "NewYork",3);
		userHashMap2.put("firstName", "kalyani");
		userHashMap2.put("lastname", "Nama");
		userHashMap2.put("gender", "female");
		userHashMap2.put("dateOfBirth", "1997-11-01");
		userHashMap2.put("aadharNumber",258741369 );
		userHashMap2.put("email", "kalyani@gmail.com");
		userHashMap2.put("mobileNumber", 8790730294l);
		userHashMap2.put("address", "Anantapur");
		userHashMap2.put("accountNumber", 6666566666666l);
		userHashMap2.put("openingBalance", 1500.00);
		userHashMap2.put("pin", 6667);
		userHashMap2.put("username", "arun");
		userHashMap2.put("password", "Arun@98");
		userHashMap2.put("bankBranch", "AMERICA");
		userHashMap2.put("customerId", 2);
		userList.add(userHashMap2);

		HashMap<String, Object> userHashMap3 = new HashMap<String, Object>();
		userHashMap3.put("firstName", "Nandha");
		userHashMap3.put("lastName", "Kumar");
		userHashMap3.put("gender", "male");
		userHashMap3.put("dateOfBirth", "1997-04-19");
		userHashMap3.put("aadharNumber", 202015698l);
		userHashMap3.put("email", "nandha@gmail.com");
		userHashMap3.put("mobileNumber", 9874563210l);
		userHashMap3.put("address", "Chennai");
		userHashMap3.put("accountNumber", 664366666656l);
		userHashMap3.put("openingBalance", 1000.00);
		userHashMap3.put("pin", 6668);
		userHashMap3.put("username", "nandha");
		userHashMap3.put("password", "Nandha@97");
		userHashMap3.put("bankBranch", "INDIA");
		userHashMap3.put("customerid", 3);
		userList.add(userHashMap3);
		
		HashMap<String, Object> userHashMap4 = new HashMap<String, Object>();
		userHashMap3.put("firstName", "Sravani");
		userHashMap3.put("lastName", "SomaRaju");
		userHashMap3.put("gender", "Female");
		userHashMap3.put("dateOfBirth", "1997-08-19");
		userHashMap3.put("aadharNumber", 5874693210l);
		userHashMap3.put("email", "sravani@gmail.com");
		userHashMap3.put("mobileNumber", 9876541230l);
		userHashMap3.put("address", "Vijayawada");
		userHashMap3.put("accountNumber", 6643666666654l);
		userHashMap3.put("openingBalance", 1000.00);
		userHashMap3.put("pin", 6669);
		userHashMap3.put("username", "sravani");
		userHashMap3.put("password", "Sravani@97");
		userHashMap3.put("bankBranch", "Germany");
		userHashMap3.put("customerid", 4);
		userList.add(userHashMap4);
		
		HashMap<String, Object> userHashMap5 = new HashMap<String, Object>();
		userHashMap3.put("firstName", "Lokesh");
		userHashMap3.put("lastName", "B");
		userHashMap3.put("gender", "male");
		userHashMap3.put("dateOfBirth", "1997-10-19");
		userHashMap3.put("aadharNumber", 2020136547l);
		userHashMap3.put("email", "lokesh@gmail.com");
		userHashMap3.put("mobileNumber", 9876543210l);
		userHashMap3.put("address", "Chennai");
		userHashMap3.put("accountNumber", 664366666689l);
		userHashMap3.put("openingBalance", 1000.00);
		userHashMap3.put("pin", 6670);
		userHashMap3.put("username", "lokesh");
		userHashMap3.put("password", "Lokesh@97");
		userHashMap3.put("bankBranch", "Hyderabad");
		userHashMap3.put("customerid", 5);
		userList.add(userHashMap5);
	}
	public static void atmlogin() {
		HashMap<String, Object> userHashMap = new HashMap<String, Object>();
//		ATM atm1 = new ATM("debit", "credit",6666);
		userHashMap.put("cardtype", "debit");
		userHashMap.put("cardtype1","credit");
		atm.add(userHashMap);
	}

	public static void adminlogin() {
			HashMap<String, Object> userHashMap6 = new HashMap<String, Object>();
			BankAdmin admin = new BankAdmin("kalyani","kalyani@55");
			userHashMap6.put("username", admin.getuserName());
			userHashMap6.put("password", admin.getPassword());
			//admin.add(userHashMap6);
		}

}

