package practiceLogicalPrograms;

import java.util.Scanner;

public class A_20_ReverseTheString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		sc.close();
		//String str = "management";
		String rev = "";
		for (int i=str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println("Reversed String: "+ rev );
	}

}
