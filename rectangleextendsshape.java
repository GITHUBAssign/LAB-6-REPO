package Repo;

import java.util.Scanner;

public class rectangle extends shape {

	@Override
	public  double CalArea(double a, double b) {
		// TODO Auto-generated method stub
		double area =a * b;
		return area;
	}

	public static void main(String[] args) {
		 triangle tr= new triangle();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter lenght and breadth of triangle");
		double lenght = sc.nextDouble();

		double breadth=sc.nextDouble();

		System.out.println("Area of rectangle is "+tr.CalArea(lenght, breadth));

	}

}