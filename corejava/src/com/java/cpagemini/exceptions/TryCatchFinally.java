package com.java.cpagemini.exceptions;

public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			System.out.println(10/-0);
			System.exit(0);
			
		} catch(ArithmeticException e) {
			System.out.println("exception caught in the code");
			//System.exit(0);// it will shut down for this line and doesnot go for the finally block because this line is after exception 
			//the compiler will not come this at all.
			//System.out.println(e.getMessage());
			//System.out.println(e.getClass());
		} catch(Exception e) {
			System.out.println("catch exception e");
			return;//it wonot returns anything but finally block will gets executed if exit(0) is not there
		}
		finally {
			System.out.println("code to be executed");//finally block will not execute always
		}
		System.out.println("printing some message");//if we not handling the exception then it will not print the stmt whatever present in the println
		
	}

}
//when finally block will not execute?
//ans: when we have Systen exit() in the catch block then finally block will never ever execute
