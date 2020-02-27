package com.java.capgemini.encapsulation;

public class User {
	private String username; // access specifiers
	@Override
	public String toString() {
		return "User [username=" + username + ", id=" + id + "]";
	}

	private String password;
	private int id;

	// in this we will use the 2 methods getter() and setter() and we have to create
	// this methods by public
	public User(String username,String password,int id) {
		this.username=username;
		this.password=password;
		this.id=id;
	}
	public User() {
		
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
//constructors are used to set the values present in the class
