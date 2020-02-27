package com.java.cpagemini.inheritence;

public interface MethodsInterface {
	public void displayMessage();
	public void print();
	public static void ShowMessage() {
		System.out.println("public static show method of method interface");
	}
	default void defaultmethodMessage() {
		System.out.println("default message");//we canot have a static methods in default we can have this before static or after static
	}
	void displayMessage1();

}
