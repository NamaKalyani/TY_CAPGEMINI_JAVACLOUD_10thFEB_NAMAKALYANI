package com.java.capgemini.collections;

public class CustonList {

	String[] list;
	int pointer = 0;

	public CustonList() {
		list = new String[10];

	}

	public CustonList(int size) {

		list = new String[size];
	}

	public void add(String element) {
		if (pointer >= list.length - 2) {
			// String[] newList = new String[list.length + 6];
			list[pointer] = element;
			pointer++;
		} else {
			String[] newList = new String[list.length + 6];
			System.arraycopy(list, 0, newList, 0, list.length);
			list = newList;
			list[pointer] = element;
			pointer++;

		}

	}

	public String get(int index) {
		return list[index];
	}

	public int size() {
		int size = 0;
//		if(list.equals(null)) {
//			return size;
//		}
//
		for (int i = 0; i < list.length; i++) {
			if (list[i] == null) {
				return size;

			} else {
				 size++;
			}

		}
		return size;
	}

	public boolean contains(String element) {
		boolean flag = false;
		for (int i = 0; i < pointer; i++) {
			if(list[i].equalsIgnoreCase(element)) {
				flag=true;
				
			}
			
		}
		return flag;
	}

}
