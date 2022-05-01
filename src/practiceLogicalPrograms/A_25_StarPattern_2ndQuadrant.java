package practiceLogicalPrograms;

import java.util.Scanner;

public class A_25_StarPattern_2ndQuadrant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows for 2nd Quadrant * pattern: ");
		int row = sc.nextInt();
		sc.close();
		for (int i=1; i<=row; i++) {
			for (int sp =row-i; sp>=1; sp--) {	//sor space print
				System.out.print(" ");
			}
			for (int str=1; str<=i; str++) {	//* printing
				System.out.print("*");
			}
			System.out.println(); 				//change of line
		}
	}

}
