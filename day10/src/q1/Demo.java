package q1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount: ");
		int amt = scan.nextInt();
		Demo d1 = new Demo();
		Hotel hotel = d1.provideFood(amt);
		if(hotel instanceof TajHotel)
		{
			hotel.chickenBiryani();
			hotel.masalaDosa();
			TajHotel h1 = (TajHotel)hotel;
			h1.welcomeDrink();
		}
		else if(hotel instanceof RoadSideHotel)
		{
			hotel.chickenBiryani();
			hotel.masalaDosa();
		}
		else
		{
			System.out.println("please enter a valid amount");
		}

	}
	public Hotel provideFood(int amount) {
		if(amount > 1000)
			return new TajHotel();
		else if(amount>200 && amount <=1000)
			return new RoadSideHotel();
		else 
			return null;
	}

}
