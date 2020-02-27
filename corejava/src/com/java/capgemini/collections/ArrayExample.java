package com.java.capgemini.collections;

import java.lang.reflect.Array;

public class ArrayExample {
	public static void main(String[] args) {
		int[] intArray = new int[6];
		int[] intArray2 = { 20, 45, 12, 15, 68, 40 };// Array is always fixed in size
		// int intArray2[]=new int[6]; not the proper way of creating an array
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		intArray[5] = 6;// A single index value is called bucket and array is a collection of buckets
		// intArray[5]=integer.parseInt("nama");//numberformatexception if we pass
		// anything as argument instead of numbers then it will give the exception
		intArray[6]=7;
		intArray[7]=8;//Arrayindexoutofboundexception and primitive datatypes doesnot accept null values
		for (int i = 0; i <= intArray.length; i++) {
			System.out.println("element at Array1 index" + i + "=" + intArray[i]);
		}
		System.out.println("++++++++++++++++++++++++++");
		for (int i : intArray2) {
			System.out.println("element at Array2 index" + i + "=" + intArray2[i]);
		}
	}

}
//we canot covert integer into string
