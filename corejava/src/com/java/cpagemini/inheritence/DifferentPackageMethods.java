package com.java.cpagemini.inheritence;

import com.java.cpagemini.methods.ArithmaticOperation;

public class DifferentPackageMethods extends ArithmaticOperation{
	public static void main(String[] args) {
		DifferentPackageMethods dfm=new DifferentPackageMethods();
		System.out.println(dfm.toString());
		System.out.println(dfm.hashCode());
		System.out.println("add method of Superclass "+add(5,7));
		System.out.println("add method of Superclass "+sub(50,7));
		System.out.println("add method of Superclass "+mul(9,7));
		System.out.println("add method of Superclass "+div(58,2));
		
	}

}
