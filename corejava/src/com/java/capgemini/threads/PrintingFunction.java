package com.java.capgemini.threads;

public class PrintingFunction {
	 synchronized public void printingDocuments(String document, int numofcopies)  {
		for (int i = 1; i <= numofcopies; i++) {
			try {
				Thread.sleep(500);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(">> printing" + document + "#" +i);
		}
	}

}
