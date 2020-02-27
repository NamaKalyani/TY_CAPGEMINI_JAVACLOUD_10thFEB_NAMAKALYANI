package com.java.capgemini.collections;

import java.util.Arrays;

public class ArraysClassExample {
	
	public static void main(String[] args) {
		int [] intArray= {01,10,15,17,27,22,55,555};
		Arrays.sort(intArray);
		for(int i=1;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("**********************************");
		int [] intArray1=Arrays.copyOf(intArray, 10);
		System.out.println("length of array" +intArray1.length);
		for(int i=1;i<intArray1.length;i++) {
			System.out.println(intArray1[i]);
		}
		System.out.println("***********************************");
		Arrays.fill(intArray1, 8,9,190);
		Arrays.fill(intArray1, 9,10,560);
		for(int i=0;i<intArray1.length;i++) {
			System.out.println(intArray1[i]);
		}
		System.out.println("**********************************");
		System.out.println(intArray.equals(intArray1));
		//These 2 methods are not same they are different from each other
		System.out.println(Arrays.equals(intArray, intArray1));
		
			
		
			
			
			
		}
		
	}


////int temp;
//for(int i=1;i<=intArray.length;i++) {
//	for(int j=i;j<intArray.length;j++) {
//		if(intArray[i]>intArray[j])
//	}
//}

