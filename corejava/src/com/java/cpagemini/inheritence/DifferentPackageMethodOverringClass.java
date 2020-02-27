package com.java.cpagemini.inheritence;

import com.java.cpagemini.methods.Methods;

public class DifferentPackageMethodOverringClass extends Methods {

		@Override
		public String printMessage() {
			return "Overriden diffferentPackageMethodOverridingClass.printMessage()";
		}

		@Override
		protected String WelcomeMessage() {
			return "Hello World from diffferentPackageMethodOverriding.WelcomeMessage()";
		}
		public static void main(String[] args) {
			DifferentPackageMethodOverringClass g=new DifferentPackageMethodOverringClass();
			 System.out.println(g.printMessage());
			 System.out.println(g.WelcomeMessage());
			
		}
	}


