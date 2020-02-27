package com.java.capgemini.encapsulation;

public class UserTesterClass {
//	private static User setUser(String username,String password,int id) {
//		return new User(username,password,id);
////	\\public static User setUser(User user) {
////		\\return new  User(user.getUsername(),user.getPassword(),user.getId());
//	}
	
	public static void main(String[] args) {
		//User user= new User("sunny","sdccfd",56);
		User u1 = setUser("kalyani", "fvfdcr", 5554);
		User u2 = new User();
		u2.setUsername("Nama");
		u2.setId(5555);
		u2.setPassword("hfjhjhhsdff");
		System.out.println(u1.getUsername());
		System.out.println(u1.getId());
		System.out.println(u2);

	}

}
//we can access the private members by getter and setter methods or by calling parametrized constructor or by calling toString()
//