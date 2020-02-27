package com.java.cpagemini.Operators;

public class LogicalOperators {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int k = 30;
		System.out.println("for logical AND operator");
		System.out.println((i > j) && (j > k));
		System.out.println((i > j) && (j < k));
		System.out.println((i < j) && (j > k));
		System.out.println((i < j) && (j < k));

		System.out.println(" for logical OR operation");

		System.out.println((i > j) || (j > k));
		System.out.println((i > j) || (j < k));
		System.out.println((i < j) || (j > k));
		System.out.println((i < j) || (j < k));
		
		
		System.out.println("NOT operator");
		System.out.println(i != j) ;
		System.out.println((i != j) || (j != k));
		
	}

}
