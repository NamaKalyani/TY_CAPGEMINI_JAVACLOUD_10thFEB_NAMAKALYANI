package com.java.capgemini.threads;

public class CustomThread2 extends Thread {
	Object ob1;
	Object ob2;
	

	public CustomThread2(Object ob1,Object ob2) {
		this.ob1=ob1;
		this.ob2=ob2;
		
	}
	@Override
	 public void run() {
		 synchronized (ob2) {
			 System.out.println(ob2);
			 synchronized (ob1) {
				 System.out.println(ob1);
				 ob1.notify();
				
			}
			
		}
	 }


}//Jvm always creates the sigle thread or jvm is a single thread application 
