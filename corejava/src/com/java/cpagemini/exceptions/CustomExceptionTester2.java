package com.java.cpagemini.exceptions;

import java.util.Scanner;

public class CustomExceptionTester2 {
	public static void main(String[] args) throws CustomException {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");
		int n = sc.nextInt();
		sc.close();
		try {
			System.out.println(10 / n);

		} catch (Exception e) {
			throw new CustomException("any message");
		}

	}
}
//custom exceptions are unchecked
