package LogicalProgrammes;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		// To identify a given number is even or odd
		
		//int A=1234;
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter a Number");
		int A = Sc.nextInt();
		
		if (A%2==0) {
			System.out.println("Given number is even");
		}else {
			System.out.println("Given number is Odd");
		}

	}
	

}
