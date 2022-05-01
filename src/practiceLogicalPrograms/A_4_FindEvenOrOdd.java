package practiceLogicalPrograms;

import java.util.Scanner;

public class A_4_FindEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num= sc.nextInt();
		sc.close();
		if(num%2==0) {
			System.out.println("Number is even");
		}
		else if(num%2!=0) {
			System.out.println("Number is odd");
		}
		else {
			System.out.println("Enter a valid number" );
		}

	}

}
