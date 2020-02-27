package com.java.cpagemini.inheritence;

public interface FunctionalInterfaceExample2 {
	public int add(int i,int j);
	
	public static void messagePrint() { 
		//we can write static method inside the functional interface
		System.out.println("public static printmessage() of functional interface");
	}
	default void messageDisplay() {
	
		System.out.println("public static displaymessage() of functional interface");
	}
	default void play()
	{
		
	}
}
