package com.java.array;

import java.util.Scanner;

public class TwoDArrayUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int student_Marks[][] = new int[2][2];

		Scanner inputReader = new Scanner(System.in);

		System.out.println("Enter the Array Numbers: ");

		for (int i = 0; i < student_Marks.length; i++) {
			for (int j = 0; j < student_Marks.length; j++) {

				student_Marks[i][j] = inputReader.nextInt();
			}

		}

		for (int i = 0; i < student_Marks.length; i++) {
			for (int j = 0; j < student_Marks.length; j++) {
				System.out.println(student_Marks[i][j]);
			}

		}

	}

}
