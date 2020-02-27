package com.java.capgemini.collections;

public class CustomListExecute {
	public static void main(String[] args) {
		CustonList cL1 = new CustonList(4);
		cL1.add("1");
		cL1.add("2");
		cL1.add("55");
		cL1.add("1");
		cL1.add("2");
		System.out.println(cL1.size());
		
		for (int i = 0; i < cL1.size(); i++) {
			System.out.println("element at " + i + "index" + cL1.get(i));
			
		}
		System.out.println("***************************");
		boolean isThere = cL1.contains("15");
		System.out.println("cL1.contains(15)" +isThere);
		System.out.println("****************************");
	}

}
