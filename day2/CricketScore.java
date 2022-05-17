package com.day2;

public class CricketScore {

	public static void main(String[] args) {
		score(5,6,2,3,1);

	}
	
	public static void score(int one,int two,int three,int four,int six) {
		int total = 1*one+2*two+3*three+4*four+6*six;
		System.out.println(total);
	}

}
