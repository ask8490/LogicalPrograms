package practiceLogicalPrograms;

import java.util.Scanner;

public class A_28_StarPattern_Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows for Pyramid: ");
		int row = sc.nextInt();
		sc.close();
		for (int i=0; i<=row; i++) {
			for (int sp =row-i; sp>=1; sp--) {	//sor space print
				System.out.print(" ");
			}
			for (int str=2; str<=i; str++) {	//* printing left part
				System.out.print("*");
			}
			for (int str=1; str<=i; str++) {	//* printing right part
				System.out.print("*");
			}
			
			System.out.println(); 				//change of line
		}
	}

}
