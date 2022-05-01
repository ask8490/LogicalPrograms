package practiceLogicalPrograms;

import java.util.Scanner;

public class A_23_StarPattern_Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of side to print square of *s: ");
		int side = sc.nextInt();
		sc.close();
		for (int i=1; i<=side; i++) {
			for (int j=0; j<=side; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
