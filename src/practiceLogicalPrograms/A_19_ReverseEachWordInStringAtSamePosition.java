package practiceLogicalPrograms;

import java.util.Scanner;

public class A_19_ReverseEachWordInStringAtSamePosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		sc.close();
		String words[] = str.split(" ");
		String rev = "";
		for (String j:words) {
			for (int i=j.length()-1; i>=0; i--) {
				rev = rev+j.charAt(i);
			}
			rev = rev+" ";
		}
		System.out.print("Reversed String without changing location of word: "+ rev );
	}

}
