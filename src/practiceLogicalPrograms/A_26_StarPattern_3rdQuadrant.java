package practiceLogicalPrograms;

import java.util.Scanner;

public class A_26_StarPattern_3rdQuadrant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows for 2nd Quadrant * pattern: ");
		int row = sc.nextInt();
		sc.close();
		for (int i=1; i<=row; i++) {
			for (int sp =1; sp<=i; sp++) {	//sor space print
				System.out.print(" ");
			}
			for (int str=row; str>=i; str--) {	//* printing
				System.out.print("*");
			}
			System.out.println(); 				//change of line
		}

	}

}
