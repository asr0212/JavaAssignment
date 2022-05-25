package q2;

public class Main {

	public static void main(String[] args) {
		DayScholar s1 = new DayScholar();
		s1.studId = 1;
		s1.studName = "anshuman";
		s1.examFee = 500;
		s1.transportFee = 400;
		s1.displayDetails();
		System.out.println("Remaining amount to be paid: "+s1.payFee(600));
		System.out.println("==============================================");
		Hosteller s2 = new Hosteller();
		s2.studId = 2;
		s2.studName = "abhishek";
		s2.examFee = 500;
		s2.hostelFee = 1000;
		s2.displayDetails();
		System.out.println("Remaining amount to be paid: "+s2.payFee(800));

	}

}
