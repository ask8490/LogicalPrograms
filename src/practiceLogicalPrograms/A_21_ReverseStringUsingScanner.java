package practiceLogicalPrograms;

import java.util.Scanner;

public class A_21_ReverseStringUsingScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		String word[] = str.split(" ");
		sc.close();
		
		System.out.println();
		String str1 ="";
		for (int i=word.length-1; i>=0; i--) {
			Scanner sc1 = new Scanner(word[i]);
			System.out.print(" ");
			str1 = sc1.next();
			System.out.print(str1);
			sc1.close();
		}
	}
}
