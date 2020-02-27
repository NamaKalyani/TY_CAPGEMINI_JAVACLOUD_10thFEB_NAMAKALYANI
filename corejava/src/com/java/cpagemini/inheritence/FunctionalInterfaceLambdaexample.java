package com.java.cpagemini.inheritence;

public class FunctionalInterfaceLambdaexample {
	static String s="lambda example for functional interface";
	static FunctionalInterfaceExample functionalinterfaceexample=() ->
{
	System.out.println(s);
	System.out.println("another line of implementation");
};
static FunctionalInterfaceExample2 f2=(i,j) -> i+j;//println internally invoke toString() so we canot print the stmt in sop
	
	public static void main(String[] args) {
		functionalinterfaceexample.displayMessage();
		functionalinterfaceexample.ShowMessage();
		int i=f2.add(17, 17);
		System.out.println(i);
		f2.messageDisplay();
		FunctionalInterfaceExample2.messagePrint();
		
	}
	public static void name() {
		functionalinterfaceexample.getClass();//global variables so it can be called anywhere in the scope of a class
	}
	//global variable can be inherited anywhere.
	

}
// the main use of the lambda function is we can call the methods with out creating ofbjects and we canot override
// it is introduced for functional interface and to reduce the number of lines
// we canot use the nonstatic variables inside the static method
// we can have the lambda functions with or without the arguments


