package com.java.cpagemini.inheritence;

public interface InterfaceImplClass extends MethodsInterface {
	@Override
	public default void displayMessage1() {
		System.out.println("overridden dispalyMesssage() of MethodsInterface");
	}

	@Override
	public default void print() {
		System.out.println("overridden printMesssage() of MethodsInterface");
	}

	@Override
	public default void displayMessage() {
		System.out.println("overridden messsagedispaly() of AnotherMethodsInterface");
	}

	public static void main(String[] args) {
////	 MethodsInterface methodsInterface =new InterfacesImplClass();
////	 AnotherMethodsInterface anotherMethodsInterface =new InterfacesImplClass();
////	 methodsInterface.print();
////	 methodsInterface.displayMessage();
////	 anotherMethodsInterface.messageDisplay();
//
//		
	}

}

