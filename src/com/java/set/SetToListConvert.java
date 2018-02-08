package com.java.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class SetToListConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> values = new LinkedHashSet<>();

		values.add("Sanjay");

		values.add("Joe");

		values.add("Sankar");

		values.add("1");

		values.add("Karti");

		System.out.println(values);

		List<String> lst = new ArrayList<>(values);

		System.out.println(lst.get(3));

	}

}
