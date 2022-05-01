package practiceLogicalPrograms;

import java.util.Scanner;

public class A_7_FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		sc.close();
		int facto = 1;
		for (int i=num; i>=1; i--) {
			facto = facto*i;
		}
		System.out.println(num+ "! = "+facto);
	}

}
