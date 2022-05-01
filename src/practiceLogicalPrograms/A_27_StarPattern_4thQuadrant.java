package practiceLogicalPrograms;

import java.util.Scanner;

public class A_27_StarPattern_4thQuadrant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows for 4th Quadrant * pattern: ");
		int row = sc.nextInt();
		sc.close();
		for (int i=1; i<=row; i++) {
			for (int str=row; str>=i; str--) {	//* printing
				System.out.print("*");
			}
			System.out.println(); 				//change of line
		}

	}

}
