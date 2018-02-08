package com.java.set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> values = new HashSet<>();

		values.add("Sanjay");

		values.add("Joe");

		values.add("Sankar");

		values.add("1");

		values.add("Karti");

		for (String e : values) {

			System.out.println(e);
		}

	}

}
