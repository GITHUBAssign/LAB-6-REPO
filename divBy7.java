package Java;

import java.util.Scanner;

public class divBy7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter lower limit");
		int lowerLimit=sc.nextInt();


		System.out.println("Enter upper limit");
		int upperLimit=sc.nextInt();


		for(int i=lowerLimit;i<=upperLimit;i++) {

			if(i%7==0) {

				System.out.println(i+" is divisible by 7");

			}


		}


	}

}
