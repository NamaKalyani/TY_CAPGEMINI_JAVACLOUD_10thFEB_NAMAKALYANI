package com.java.cpagemini.String;

public class StringExample {
	public static void main(String[] args) {
		String s1="some string";//string created by using literals
		String s2=new String("another string");//by using new keyword
		String s3="another string";
		String s4="some string";
		String s5=new String("another string");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s1.equals(s4));//first it will hechs the ascii vales
		System.out.println(s2.equals(s3));//equals() compares the content present in the string
		System.out.println(s2==s5);//== it compares the address
		
		
	}

	
}
