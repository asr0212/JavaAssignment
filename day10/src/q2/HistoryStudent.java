package q2;

import java.util.Scanner;

public class HistoryStudent extends Student{
	int historyMarks;
	int civicsMarks;

	int getPercentage() {
		int percentage = (historyMarks + civicsMarks)/2;
		return percentage;
	}
	HistoryStudent(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr history marks");
		historyMarks = scan.nextInt();
		System.out.println("Enetr civics marks");
	    civicsMarks = scan.nextInt();
	}
}
