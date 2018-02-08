package com.java.example;

public class EmployeeInfo extends PersonInfo {
	float sal;
    public String joindate, org ;

	public EmployeeInfo(String iName, int iAge, String iGender, float isal,String ijoinDate,
			String iorg ) {
		super(iName, iAge , iGender);
		sal = isal;
		joindate = ijoinDate;
		org = iorg;
	}

	public void displayEmployeeData() {
		displayPersonData();
		System.out.println("Salary:" + sal);
		System.out.println("Joining Date:" + joindate);
		System.out.println("organisation:" + org);
	}

}

