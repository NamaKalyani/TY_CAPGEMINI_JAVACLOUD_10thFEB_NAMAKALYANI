package com.java.capgemini.threads;

public class ComputerSystem2 extends Thread {
	PrintingFunction printingfunction;
	
	public ComputerSystem2(PrintingFunction localprintingfunction) {
		this.printingfunction=localprintingfunction;
		
	}
	@Override
	public  void run() {
		System.err.println(">>> printing from computer system2...");
		printingfunction.printingDocuments("someotherdocument.pdf", 10);

	}
	
	

}
