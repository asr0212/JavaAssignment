package q1;

import java.util.Scanner;

public class Student {
	private int roll;
	private String name;
	private int marks;
	private char grade;
	Student(){
		
	}
	public String toString() {
		return "Roll No: "+roll+"\n"+"Name: "+name+"\n"+"Marks: "+marks+"\n"+"Grade: "+grade;
	}
	public void displayDetails() {
		Student obj = new Student();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter roll no.:");
		obj.roll = scan.nextInt();
		System.out.println("Enter Name:");
		obj.name = scan.next();
		System.out.println("Enter marks:");
		obj.marks = scan.nextInt();
		obj.grade = calculateGrade(obj.marks);
		System.out.println(obj);
	}
	private char calculateGrade(int mark) {
		if(mark>=500)
			return 'A';
		else if(mark>=400)
			return 'B';
		else
			return 'C';
	}
}
