package com.java.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> obj1 = new ArrayList<String>();

		obj1.add("sanjay");

		obj1.add("joe");

		obj1.add("arul");

		obj1.add("sankar");

		obj1.add("Jeyakumar");

	//	int size = obj1.size();

		Iterator itr = obj1.iterator();

		while (itr.hasNext()) {
			// Object object = (Object) itr.next();

			// String num = (String) itr.next();
			//
			// System.out.println(num);

			System.out.println("Array Elements are " + itr.next());

		}
	}

}
