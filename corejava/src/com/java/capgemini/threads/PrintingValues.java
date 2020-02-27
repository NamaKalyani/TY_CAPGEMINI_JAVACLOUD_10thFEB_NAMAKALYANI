package com.java.capgemini.threads;

public class PrintingValues {
	public static void main(String[] args) {
		System.out.println("-----Applicationstarted----");
	
	//public static void printingValues1() {
		// PrintingMethodClass1.printingValues1();
		// PrintingMethodClass2.printingValues2();
		// new PrintingMethodClass1().start();

		PrintingMethodClass1 pm1 = new PrintingMethodClass1();
		pm1.start();
		try {
			pm1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		pm1.start();

		Thread thread = new Thread(new PrintingMethodClass2());
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("-----Application ended-----");
		// new Thread(new PrintingMethodClass2()).start();
		// new PrintingMethodClass2().start();
	}

	
	


}
