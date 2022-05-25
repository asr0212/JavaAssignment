package q4;

public class AxisBank extends Bank{
   double rateOfInterest = 7;
	public void displayDetails() {
		System.out.println(branchName);
		System.out.println(ifscCode);
		System.out.println(rateOfInterest);
	}
	AxisBank(){
		getCreditCard();
	}
	public void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
}
