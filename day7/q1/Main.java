package q1;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name = "Anshuman";
		e1.age = 25;
		e1.phoneNumer = "1234567";
		e1.address = "jodhpur";
		e1.salary = 25000;
		e1.printSalary();
		Manager m1 = new Manager();
		m1.name = "Abhishek";
		m1.age = 24;
		m1.phoneNumer = "3214567";
		m1.address = "jaipur";
		m1.salary = 70000;
		m1.printSalary();
		

	}

}
