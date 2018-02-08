package com.java.list;

import java.util.ArrayList;

public class ArrayListForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> obj1 = new ArrayList<String>();

		obj1.add("sanjay");

		obj1.add("joe");

		obj1.add("arul");

		obj1.add("sankar");

		obj1.add("Jeyakumar");

		int size = obj1.size();

		for (String str : obj1) {
			System.out.println("Array Elements are " + str);
		}

	}

}
