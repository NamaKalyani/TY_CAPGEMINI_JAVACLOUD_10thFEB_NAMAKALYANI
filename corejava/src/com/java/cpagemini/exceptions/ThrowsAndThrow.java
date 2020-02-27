package com.java.cpagemini.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ThrowsAndThrow {
	public static void main(String[] args) throws Exception  {
		Properties properties=new Properties();
		
		new Properties().load(new FileReader("application.properties"));
		
		System.out.println(properties.getProperty("name"));
		
		System.out.println("some code");
	}

}
//throws is a keyword which handles the exception and throw is a keyword which explicitly calls the exception												
