package com.java.cpagemini.exceptions;

public class TryFinally {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} finally {
			System.out.println("code inside finally block is executed");
	} 
		
	}

}// we will use this only in the unchecked exceptions
