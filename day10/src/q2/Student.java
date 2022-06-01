package q2;

import java.util.Scanner;

public abstract class Student {
    String name;
    String address;
    
    abstract int getPercentage();
    
    Student(){
    	Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of student");
    	this.name  = scan.next();
    	System.out.println("Enter address of student");
    	this.address = scan.next();
    }
}
