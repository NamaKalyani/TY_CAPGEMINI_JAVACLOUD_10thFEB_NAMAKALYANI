package com.java.cpagemini.inheritence;

public class MethodsInterfaceJ8Impl implements MethodsInterface {

	@Override
	public  void displayMessage() {
		// TODO Auto-generated method stub
		System.out.println("overriden display messsage() of method interface");
	}

	@Override
	public  void print() {
		// TODO Auto-generated method stub
		System.out.println("over riden print() of methods Interface");
		
	}
	public static void main(String[] args) {
		MethodsInterfaceJ8Impl miji= new MethodsInterfaceJ8Impl();
		miji.displayMessage();
		miji.print();
		miji.defaultmethodMessage();
		MethodsInterface.ShowMessage();
		
		
	}
	

}
