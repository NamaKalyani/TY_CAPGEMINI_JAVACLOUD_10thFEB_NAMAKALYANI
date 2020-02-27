package com.java.cpagemini.inheritence;

public class FunctionalInterfaceImpl implements FunctionalInterfaceExample,FunctionalInterfaceExample2 {

	@Override
	public void ShowMessage() {
		// TODO Auto-generated method stub
		System.out.println("over riden shoemessage() of functional interface");
		
	}
	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}
	public static void main(String[] args) {
		FunctionalInterfaceImpl f=new FunctionalInterfaceImpl();
		f.ShowMessage();
		f.displayMessage();
		System.out.println(f.add(55,52));//f.add(55,52);
		f.displayMessage();
		FunctionalInterfaceExample2.messagePrint();//we have to call the static methods with its class name
		
		
		
	}
			
		
	}
	
	
	


