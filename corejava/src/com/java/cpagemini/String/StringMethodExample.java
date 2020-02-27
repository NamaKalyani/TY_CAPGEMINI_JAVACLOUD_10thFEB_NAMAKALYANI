package com.java.cpagemini.String;
//length()
public class StringMethodExample {
	public static void main(String[] args) {
		String s1="some string";
		String s2="";
		String s3="Some StRing";
		int length=s1.length();
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		
		//isempty()
		System.out.println("is empty() of string:" +s1.isEmpty());
		
		System.out.println(s2.isEmpty());
		
		
		//charAt ()
		System.out.println(s1.charAt(s1.length()-1));//index value should always be less than length
		//s2.charAt(2);Stringindenceout of bounce exception
		System.out.println(s1.charAt(4));
		System.out.println("equals() of string:" +s1.equals(s3));//false here it will check the Ascii values
		
		
		//equalsignorecase()
		System.out.println("equals() of string:" +s1.equalsIgnoreCase(s3));//true
		
		//concat()
		System.out.println(s1.concat("connects to another string"));//it will takes string as an input argument
		System.out.println(s1);//immutable once the value of the string is fixed we canot change the value of the string.
		String s4=s1.concat("connects to another string");
		System.out.println(s4);
		
		//replace()
		String s5=s1.replace('s', 'k');
		System.out.println(s5);
		
		//valueOf
		String s6=String.valueOf(55689);
		System.out.println(s6);//it is used to convert the data into the String
		
		//uppercase and lowercase
		System.out.println(s1.toUpperCase());
		System.out.println(s4.toLowerCase());
		
		//substring()
		String s7="kalyani".substring(2);//lyani it begins from 2nd index
		System.out.println(s7);
		System.out.println(s4.substring(12, 18));
		System.out.println(s1);//immutable even after performing many operation the value of he string remains same it didnot changed
		//String buffer are String builder is mutable
		//string buffer if synchronozation to protect the threads we will use buffer
		//string builder is not synchronized it is used for applications where we donot care about the thread safety
		
		

		
	}

}

