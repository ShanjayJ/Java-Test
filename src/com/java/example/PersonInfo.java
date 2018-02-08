package com.java.example;

public class PersonInfo {

	public String name , gender;
	private int age;

	public PersonInfo(String pName, int pAge, String pGender) {
		name = pName;
		age = pAge;
		gender = pGender;

	}

	protected void displayPersonData() {
		System.out.println("NAME:" + name);
		System.out.println("AGE:" + age);
		System.out.println("Gender:" + gender);

	}

	

}
