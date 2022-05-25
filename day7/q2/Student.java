package q2;

public class Student {
	int studId;
	String studName;
	double examFee;
	Student(){
		System.out.println("I am Student");
	}
	
	public void displayDetails(){
		System.out.println("Student ID: "+studId);
		System.out.println("Stident Name: "+studName);
	}
	public double payFee(double fee){
		return examFee-fee;
	}
}
