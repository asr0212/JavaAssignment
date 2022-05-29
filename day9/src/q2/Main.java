package q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 10");
		int x = scan.nextInt();
	    Parent objP = new Child(x);
        objP.method1();
        objP.method2();
        objP.method3();
        Child objC= (Child)objP;
        objC.method4();
        
		
	}

}
