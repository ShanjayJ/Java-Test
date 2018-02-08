package com.java.example;

import java.util.Scanner;

public class InheritPersonDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, gender, joindate, orgi;
		int age;
		float sal;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Name:");
		name = inputReader.nextLine();
		System.out.println("Enter the Gender:");
		gender = inputReader.nextLine();
		System.out.println("Enter the Age:");
		age = inputReader.nextInt();
		System.out.println("Enter the Salary:");
		sal = inputReader.nextFloat();
		System.out.println("Enter the JoiningDate:");
		joindate = inputReader.next();
		System.out.println("Enter the Organisation:");
		orgi = inputReader.next();
		EmployeeInfo child = new EmployeeInfo(name, age, gender , sal ,joindate,orgi);
		child.displayEmployeeData();

	}

	}

