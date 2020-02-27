package com.java.cpagemini.String;

public class StringBufferExample {
	public static void main(String[] args) {
		String s1 = "some stringbuffer";
		StringBuffer stringbuffer = new StringBuffer(s1);
		System.out.println(stringbuffer.getClass());
		System.out.println(stringbuffer.length());
		stringbuffer.append("buffer");// it doesnot support the concate method and it is used to join the two
										// stringsbuffer
		System.out.println(stringbuffer);// mutable
		System.out.println(stringbuffer.reverse());
		System.out.println(stringbuffer.reverse());
		stringbuffer.replace(0, 1, "k");
		System.out.println(stringbuffer);
		stringbuffer.insert(5, "nama");// insert()
		System.out.println(stringbuffer);// this method we donot have in the string
		int index = stringbuffer.indexOf("nama");// here the string was inserted at index5 in line 15
		// if we donot have any string in the program then it returns the value as -1
		System.out.println(index);
		stringbuffer.delete(5, 8);
		System.out.println(stringbuffer);

	}

}
//Why is string made as an immutable class?
//write down the difference between string ,string buffer and builder?
//Method overriding is an example of runtime polymorphism and overloading is an example of method overloading