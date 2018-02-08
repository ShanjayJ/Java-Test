package com.java.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> values = new LinkedHashSet<>();

		values.add("Sanjay");

		values.add("Joe");

		values.add("Sankar");

		values.add("1");

		values.add("Karti");

		for (int i = 0; i < values.size(); i++) {

			System.out.println(values);

		}
	}

}
