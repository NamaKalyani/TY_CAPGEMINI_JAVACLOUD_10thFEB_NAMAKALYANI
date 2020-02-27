package com.java.cpagemini.inheritence;

public interface Interface1 {
	public void display();
	public static void message() {
		System.out.println("display some message");
	}
	public static void study() {
		System.out.println("just study");
	}
	
	default void play()
	{
		System.out.println("plays");
	}

}
