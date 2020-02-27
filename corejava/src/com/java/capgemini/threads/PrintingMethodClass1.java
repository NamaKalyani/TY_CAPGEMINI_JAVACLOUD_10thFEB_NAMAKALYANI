package com.java.capgemini.threads;

public class PrintingMethodClass1 extends Thread {
	@Override
	public void run() {
		try {
		Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=1;i<10;i++) {
			System.out.println("printing values:" +i);
		}
		

}

}
//data inconsistency-->every time we are running the code we will get the different output

