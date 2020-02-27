package com.java.capgemini.abstraction;

import com.java.capgemini.Polymorphism.MethodsInterface;

public abstract class AbstractClassExample implements MethodsInterface

{
	abstract String display();

	abstract String print();// if we create the concrete class it is mandetory to implement all the
							// unimlpemented methods
	public String printMessafe() {
		return "printMessage() of methodinterface";
		
		
	}
	

}
