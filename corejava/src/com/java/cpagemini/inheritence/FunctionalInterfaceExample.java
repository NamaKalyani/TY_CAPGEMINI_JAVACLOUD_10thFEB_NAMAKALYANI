package com.java.cpagemini.inheritence;

@FunctionalInterface
public interface FunctionalInterfaceExample {
	public void ShowMessage();//abstract method
//	public void displayMessage();

//	
	public static void printMessage() { 
		//we can write static method inside the functional interface
		System.out.println("public static printmessage() of functional interface");
	}
	default void displayMessage() {
	
		System.out.println("public static displaymessage() of functional interface");
	}
}
//A functional interface should have only one one abstrct method its just acts like regular interface but it has no use