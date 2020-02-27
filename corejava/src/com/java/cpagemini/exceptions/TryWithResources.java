package com.java.cpagemini.exceptions;

import java.util.Scanner;

public class TryWithResources {// this class should be implementing autoclosable
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int i = 10;
			int j = scanner.nextInt();
			if (j == 0)
				System.out.println("should not divided by 0");
			else
				System.out.println(i / j);

		}
		try {

		} catch (Exception e) {
			System.out.println("we can use multiple trys");
		}
	}
}
//try{
//system.out.prinln(10/0);
//finally{sout("code inside finally block")
//we can write try finally blocks without the catch block ,but code inside finally block will execute
//we canot write finally inside finally
//we can write only try with out any blocks only in the case of the try with resourses
//only one final block is allowed in a program
//all the exceptions will be extending exception
