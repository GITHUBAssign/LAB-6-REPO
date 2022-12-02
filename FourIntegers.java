package Java;

import java.util.Scanner;

public class FourIntegers {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter four numbers ");
		int num1= sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int num4=sc.nextInt();

		if((num1==num2)&&(num2==num3)&&(num3==num4)&&(num4==num1)) {

			System.out.println("Number are  equal");


		}
		else {
			System.out.println("Number are not equal");
		}



	}

}
