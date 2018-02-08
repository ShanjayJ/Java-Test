package com.java.array;

import java.util.Scanner;

public class SingleDimUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totalSize;

		int student_id[] = new int[5]; // Size is fixed
		
		Scanner inputReader = new Scanner(System.in);
		
		System.out.println("Enter the Array Numbers: ");
		
		for (int i = 0; i < student_id.length; i++) {
			student_id[i] = inputReader.nextInt();
		}

		totalSize = student_id.length;

		System.out.println("Size of array is " + totalSize);

		System.out.println("Student ID is" + student_id[4]);

		for (int i = 0; i < totalSize; i++) {
			System.out.println("Student ID for " + i + " is " + student_id[i]);

		}

	}

}
