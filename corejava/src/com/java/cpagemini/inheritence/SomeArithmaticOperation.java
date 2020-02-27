package com.java.cpagemini.inheritence;

import com.java.cpagemini.methods.ArithmaticOperation;

public class SomeArithmaticOperation extends ArithmaticOperation {
	public void SomeArithmeticOperation() {
		//super("A");
		
		System.out.println(" SomeArithmeticOperation constructor....");
		
	}
	
	
	public static void main(String[] args) {
		SomeArithmaticOperation ao =new SomeArithmaticOperation();
		
		
		System.out.println("add method of superclass "+add(4,8));
		System.out.println("sub method of superclass "+sub(4,8));
		System.out.println("mul method of superclass "+mul(4,8));
		System.out.println("div method of superclass "+div(48,8));
	}

}
