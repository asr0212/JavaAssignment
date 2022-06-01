package q2;

import java.util.Scanner;

public class ScienceStudent extends Student{
	int phisicsMarks;
	int chemistryMarks;
	int mathMarks;

	int getPercentage() {
		int percentage = (phisicsMarks+chemistryMarks+mathMarks)/3;
		return percentage;
	}
	ScienceStudent(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr phisics marks");
		phisicsMarks = scan.nextInt();
		System.out.println("Enetr chemistry marks");
	    chemistryMarks = scan.nextInt();
		System.out.println("Enetr math marks");
		mathMarks = scan.nextInt();
	}
}
