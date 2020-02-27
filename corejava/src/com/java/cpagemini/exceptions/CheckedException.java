package com.java.cpagemini.exceptions;

import java.io.FileReader;
import java.util.Properties;

public class CheckedException {
	public static void main(String[] args) {
		Properties properties=new Properties();
		try {
			properties.load(new FileReader("application.properties"));
		} catch(Exception e) {
			System.out.println("exception caught in try");
			e.printStackTrace();
		} finally {
			System.out.println("code in finally block");
		}
		
	}

}
