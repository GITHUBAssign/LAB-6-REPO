package Repo;

import java.util.Scanner;

public class Parallelogram extends shape {

	
	@Override
	public double CalArea(double a, double b) {
		// TODO Auto-generated method stub
		
		return a*b;
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Parallelogram pl= new Parallelogram();
		
		
		System.out.println("Enter base and height of Parallelogram");
		double base= sc.nextDouble();
		double height= sc.nextDouble();
		
		System.out.println("Area of Parallelogram is :"+pl.CalArea(base, height));
	}

	

}