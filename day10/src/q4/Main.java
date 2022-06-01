package q4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Shape s = new Area();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle: ");
		int length = scan.nextInt();
		int breadth = scan.nextInt();
		System.out.println("Enter side of square: ");
		int side = scan.nextInt();
		System.out.println("Enter radius of circle: ");
		int radius = scan.nextInt();
		System.out.println("Area of Rectangle: "+s.rectangleArea(length, breadth));
		System.out.println("Area of Square: "+s.squareArea(side));
		System.out.println("Area of Circle: "+s.circleArea(radius));	

	}

}
