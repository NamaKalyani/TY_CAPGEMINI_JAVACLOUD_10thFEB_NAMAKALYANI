package com.java.cpagemini.methods;

public class VaragsInputExample {
	public int add(int... is) {
		int sum = 0;
		for (int i = 0; i < is.length; i++) {
			sum += is[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("sum is:" +
	new VaragsInputExample().add(1, 2, 5, 98, 100, 10000));// instead of creating method we can
																					// write the contents in the array
	}
}
//Array is always fixed in size