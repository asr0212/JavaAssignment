package q2;

public class DayScholar extends Student{
	double transportFee;
	DayScholar(){
		System.out.println("I am DayScholar");
	}
	public double payFee(double fee){
		return (examFee+transportFee) - fee;
	}
}
