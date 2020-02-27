package com.java.cpagemini.exceptions;

public class ExceptionExample1 {
	public static void main(String[] args) {
		String string="";
		
		try {
			int i=10/0;
			
			System.out.println(string.charAt(3));
			
			System.out.println(i);//
			
		}catch (StringIndexOutOfBoundsException e) { //argument will be type of exception exception class doesnot have any methods
			System.out.println("charAt(index) should not be called on null string");
			System.out.println(e.getClass());//it will tell what type of exception we got
			System.out.println(e.getCause());// prints we have got the exception
			System.err.println(e.getMessage());
			
		}catch(ArithmeticException e) {
			System.out.println("should not be divided by zero");
			System.out.println(e.getClass());
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		} //catch(Exception e) {
//			System.out.println("exceptions got in the code");
//			System.out.println(e.getClass());
//			System.out.println(e.getMessage());
//		}
		
		//System.out.println(string.charAt(3));//stringindexoutofbound exception and it is a unchecked or runtime exceptions
		//the exceptions which we will get at the compile time are called checked exceptions and the exceptions which we
		//will get during the runtime is called unchecked exceptions.
		// exceptions will be thrown only at the runtime or compile time 
		// we can handle the exceptions by using try and catch blocks
		//if we have n number of exceptions we can have n no. of catch blocks
		//exception must be last executable stmt when we have multiple catch blocks
		//catch is a block it is not a method and it doesnot have any methods to execute
		
	}

}
