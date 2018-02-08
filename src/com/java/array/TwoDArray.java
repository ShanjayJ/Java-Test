package com.java.array;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int student_Marks[][]= new int [2][2];
		student_Marks[0][0] = 1 ;
		student_Marks[0][1] = 2 ;
		student_Marks[1][0] = 90 ;
		student_Marks[1][1] = 84 ;
		
		
		for (int i = 0; i < student_Marks.length; i++) {
			for (int j = 0; j < student_Marks.length; j++) {
				System.out.println(student_Marks[i][j]);
			}
			
		}


	}

}
