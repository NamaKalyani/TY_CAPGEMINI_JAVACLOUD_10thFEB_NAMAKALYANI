package com.java.capgemini.threads;

public class PrinterMachine {
	 public static void main(String[] args) {
		System.out.println("++++++printer machine strated++++");
		PrintingFunction printingfunction=new PrintingFunction();
		CoumputerSystem1 cs1=new CoumputerSystem1(printingfunction);
		ComputerSystem2 cs2=new ComputerSystem2(printingfunction);
		cs1.start();
		try {
			cs1.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		cs2.start();
		try {
			cs2.join();
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("++++printer machine ended++++");
	}

}
//a single resource will be used by multiple conditions
