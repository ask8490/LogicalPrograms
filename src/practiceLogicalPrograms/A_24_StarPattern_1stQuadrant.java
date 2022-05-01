package practiceLogicalPrograms;

import java.util.Scanner;

public class A_24_StarPattern_1stQuadrant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows for 1st Quadrant * pattern: ");
		int row = sc.nextInt();
		sc.close();
		for (int i=1; i<=row; i++) {
			for (int str=1; str<=i; str++) {	//* printing
				System.out.print("*");
			}
			System.out.println(); 				//change of line
		}

	}

}
