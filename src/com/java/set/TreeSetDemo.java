package com.java.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> values = new TreeSet<>();

		values.add("Sanjay");

		values.add("Joe");

		values.add("Sankar");

		values.add("1");

		values.add("Karti");

		Iterator<String> itr = values.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());

		}

	}

}
