package com.java.capgemini.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExample {
	public static void main(String[] args) {
		// ArrayList<Integer> arraylist = new ArrayList<Integer>();
		ArrayList<Integer> arraylist = new ArrayList<Integer>(10);

		arraylist.add(55);
		arraylist.add(15);
		arraylist.add(16);
		arraylist.add(17);
		arraylist.add(22);
		arraylist.add(8);
		arraylist.add(27);
		arraylist.add(97);
		arraylist.add(02);
		arraylist.add(03);
		arraylist.add(6);
		arraylist.add(79);
		// arraylist.add(4,34); and arraylist is dynamic in size
		
		System.out.print("size of array list:" + arraylist.size());
		System.out.println("*************************");
		Collections.sort(arraylist);

		for (Integer integer : arraylist) {
			System.out.println(integer);
		

		}
		System.out.println(arraylist);
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
			
			
		}
		System.out.println();
		System.out.println("*********************");
		arraylist.remove(5);
		System.out.println("size of arraylist after remove()" +arraylist.size());
		System.out.println("***************");
		
		Collections.rotate(arraylist,-(arraylist.size()-1));
		System.out.println(arraylist);
		//Arrays.sort(arraylist);
		System.out.println("***************");
		boolean isThere1=arraylist.contains(05);
		boolean isThere2=arraylist.contains(17);
		boolean isThere3=arraylist.contains(null);
		System.out.println("output of arraylist.contains()" +isThere1);
		System.out.println(isThere2);
		System.out.println(isThere3);
		
		
		//System.out.println(arraylist.get(0));
		//System.out.println(arraylist.get(1));
		// System.out.println(arraylist.get(2));//shows exception since the size is 2
		// and array size is always size-1
		//contains() gives the only values which are present in the arraylist
	}

}
