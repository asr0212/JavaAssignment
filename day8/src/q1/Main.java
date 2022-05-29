package q1;

public class Main {

	public static void main(String[] args) {
		Bird b1 = new Parrot();
		b1.fly();
		
		Parrot p1 = (Parrot)b1;
		p1.sing();
        Bird a = new Bird();
        Parrot b = (Parrot)a;
        b.sing();
	}

}
