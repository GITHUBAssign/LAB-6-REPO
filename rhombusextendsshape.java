package Repo;

import java.util.Scanner;

public class rhombus  extends shape{

	@Override
	public double CalArea(double a, double b) {
		double area=(a*b)/2;
		return area;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		rhombus rh= new rhombus();
		
		System.out.println("Enter diagonals of rhombus");
		double diagonal1=sc.nextDouble();
		double diagonal2=sc.nextDouble();
		
		System.out.println("Area of rhombus :"+rh.CalArea(diagonal1, diagonal2));
		
		
	}

	

}