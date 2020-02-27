package com.java.cpagemini.exceptions;

import java.util.Scanner;

public class CustomExceptionTester {

	public static void main(String[] args) throws CustomException {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("enter the number");
		if (i >= 0 && i <= 10) {
			System.out.println(i * 10);
		} else {
			throw new CustomException("custom exception message");// to actually throw that particular exception

		}
		sc.close();
	}
}
//
