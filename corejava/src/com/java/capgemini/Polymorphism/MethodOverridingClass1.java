package com.java.capgemini.Polymorphism;

public class MethodOverridingClass1 implements MethodsInterface {

	@Override
	public String displayMessage() {
		
		return "overriden displayMessage() of methods interface from methodoverridingclass";
	}

	@Override
	public String printMessafe() {
		
		return "overriden displayPrint() of methods interface from methodoverridingclass";
	}

}
