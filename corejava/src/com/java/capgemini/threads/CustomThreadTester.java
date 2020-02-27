package com.java.capgemini.threads;

public class CustomThreadTester {
	public static void main(String[] args) {
		
		Object ob1=new Object();
		Object ob2=new Object();
		
		//System.out.println("main thread started");
		new CustomThread1(ob1,ob2).start();
		new CustomThread2(ob2,ob1).start();
		
	}

}
