package com.java.array;

public class SingleDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalSize;

		int student_id[] = new int[5]; // Size is fixed
		student_id[0] = (int) 56.0; // Datatype is fixed
		student_id[1] = 85;
		student_id[2] = 88;
		student_id[3] = 94;
		student_id[4] = 78;

		totalSize = student_id.length;

		System.out.println("Size of array is " + totalSize);

		System.out.println("Student ID is" + student_id[4]);

		for (int i = 0; i < totalSize; i++) {
			System.out.println("Student ID for " + i + " is " + student_id[i]);

		}

	}

}
