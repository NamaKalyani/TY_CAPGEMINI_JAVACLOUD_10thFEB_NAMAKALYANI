package com.java.capgemini.threads;

public class CoumputerSystem1 extends Thread {
	PrintingFunction printingfunction;

	public CoumputerSystem1(PrintingFunction localprintingfunction) {
		this.printingfunction = localprintingfunction;
	}

	@Override
	public void run() {
		System.err.println(">>> printing from computer system1...");
		printingfunction.printingDocuments("someotherdocument.pdf", 10);

	}

}
//What is Thread-->It is a light weight process which is present in 