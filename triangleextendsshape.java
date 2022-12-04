package Repo;

import java.util.Scanner;

public class triangle  extends shape{
	@Override
	public double CalArea(double base, double height) {
		double area=(base*height)/2;
		return area;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		triangle tr= new triangle();
		
		System.out.println("Enter base and height of triangle");
		double base=sc.nextDouble();
		double height=sc.nextDouble();
		
		System.out.println("Area of rhombus :"+tr.CalArea(base, height));
	}
		
	}