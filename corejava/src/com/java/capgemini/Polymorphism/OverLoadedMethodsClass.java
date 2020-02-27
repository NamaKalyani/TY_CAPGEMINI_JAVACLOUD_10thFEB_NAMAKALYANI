package com.java.capgemini.Polymorphism;

public class OverLoadedMethodsClass {
	public  int add(int i,int j) { //all have same methods
		return i+j;
	}
	public  int add(int i,int j,int k) {
		return i+j+k;
	}
	public  double add(int i,double d) {
		return i+d;
	}
	public  double add(double d,int i) {
		return d+i;
	}
	

}
