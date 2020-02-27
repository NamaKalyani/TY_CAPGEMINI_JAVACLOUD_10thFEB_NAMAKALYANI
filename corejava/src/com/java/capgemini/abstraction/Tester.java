package com.java.capgemini.abstraction;

public class Tester extends AbstractClassExample {

	@Override
	public String displayMessage() {

		return "displayMessage() of method interface";
	}

	@Override
	String display() {

		return "display() of abstract class";
	}

	@Override
	String print() {
		// TODO Auto-generated method stub
		return "print() of abstract class";
	}

	public static void main(String[] args) {
		Tester t = new Tester();
		System.out.println(t.display());
		System.out.println(t.displayMessage());
	}

}
