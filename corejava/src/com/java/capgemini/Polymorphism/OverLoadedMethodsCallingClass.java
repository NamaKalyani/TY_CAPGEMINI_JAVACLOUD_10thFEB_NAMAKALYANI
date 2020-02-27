package com.java.capgemini.Polymorphism;

public class OverLoadedMethodsCallingClass {
	public static void main(String[] args) {
		OverLoadedMethodsClass overLoadedMethodsCallingClass=new OverLoadedMethodsClass();
		System.out.println("add(int i,int j):" + overLoadedMethodsCallingClass.add(5, 6));
		System.out.println("add(int i,int j,int k):"+overLoadedMethodsCallingClass.add(5,6,7));
		System.out.println("add(int i,double d):"+overLoadedMethodsCallingClass.add(5,6.55));
		System.out.println("add(double d ,int i):"+overLoadedMethodsCallingClass.add(5.66,6));
		
		
		
		
	}

}
