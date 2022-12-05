package Repo;

import java.util.Scanner;

public class circle extends shape {

	@Override
	public  double CalArea(double radius, double pie) {
		// TODO Auto-generated method stub
		double area = 3.14 * radius * radius;
		return area;
	}

	public static void main(String[] args) {
		 circle cr= new circle();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius of circle");
		int radius = sc.nextInt();

		double pi = 3.14;

		System.out.println("Area of circle is :"+cr.CalArea(radius, pi));

	}

}
