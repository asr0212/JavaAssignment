package com.day3;

public class Student {
	
	int roll;
	String name;
	int marks;
	
	public void displayStudentDetails() {
		System.out.println("Roll is : "+roll);
		System.out.println("Name is : "+name);
		System.out.println("Marks is : "+marks);
	}

	public static void main(String[] args) {
		Student a1 = new Student();
		a1.roll = 3;
		a1.name = "anshuman";
		a1.marks = 70;
		a1.displayStudentDetails();
		
		Student a2 = new Student();
		a2.roll = 1;
		a2.name = "abhishek";
		a2.marks = 65;
		a2.displayStudentDetails();
		
		a1 = null;
		a2 = null;

	}

}
