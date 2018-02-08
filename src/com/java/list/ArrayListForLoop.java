package com.java.list;

import java.util.ArrayList;

public class ArrayListForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> obj1 = new ArrayList<String>();

		obj1.add("sanjay");

		obj1.add("joe");

		obj1.add("arul");

		obj1.add("sankar");

		obj1.add("Jeyakumar");

		int size = obj1.size();

		for (int i = 0; i < size; i++) {

			System.out.println("Array List Elements are " + obj1.get(i));

		}

	}

}
