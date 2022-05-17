package com.day2;

public class PrimeFactorial {

	public static void main(String[] args) {
		primeFact(12);
	}
	
	public static void primeFact(int args) {
		for(int i=1;i<=args;i++) {
			if(args%i == 0)
				System.out.println(i);
		}
	}

}
