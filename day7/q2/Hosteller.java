package q2;

public class Hosteller extends Student{
	double hostelFee;
	Hosteller(){
		System.out.println("I am Hosteller");
	}
	public double payFee(double fee){
		return (examFee+hostelFee) - fee;
	}
	
}
