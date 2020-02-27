package com.java.capgemini.threads;

public class CustomThread1 extends Thread {
	Object ob1;
	Object ob2;
	
	public CustomThread1(Object ob1,Object ob2) {
		this.ob1=ob1;
		this.ob2=ob2;
		
	}
	@Override
	 public void run() {
		 synchronized (ob1) {
			 System.out.println(ob1);
			 try {
				 Thread.sleep(500);
				 //ob1.wait();
			 }catch(InterruptedException e) {
				 e.printStackTrace();
			 }
			 synchronized (ob2) {
				 System.out.println(ob2);
				
			}
			
		}
	 }

}
