package q2;

public class AllStudents {

	public static void main(String[] args) {
		Student s1 = new ScienceStudent();
		System.out.println("Percentage of "+s1.name+" is "+s1.getPercentage());
		Student s2 = new HistoryStudent();
		System.out.println("Percentage of "+s2.name+" is "+s2.getPercentage());

	}

}
