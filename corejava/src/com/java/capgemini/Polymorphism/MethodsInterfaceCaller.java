package com.java.capgemini.Polymorphism;

import com.java.cpagemini.methods.MethodOverRiding;

public class MethodsInterfaceCaller {
	public static void main(String[] args) {
		// MethodOverridingClass1 m1 = new MethodOverridingClass1();
		// MethodOverridingClass2 m2 = new MethodOverridingClass2();
		MethodsInterface m1 = new MethodOverridingClass1();//upcasting
		MethodsInterface m2 = new MethodOverridingClass2();
		
		System.out.println(m1.displayMessage());
		System.out.println(m1.printMessafe());

		System.out.println(m2.displayMessage());
		System.out.println(m2.printMessafe());

	}

}
//println is also a example of abstraction
