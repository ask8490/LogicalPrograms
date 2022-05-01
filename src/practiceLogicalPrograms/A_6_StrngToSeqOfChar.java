package practiceLogicalPrograms;

import java.util.Scanner;

public class A_6_StrngToSeqOfChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str= sc.nextLine();
		sc.close();
		char[] strArr = str.toCharArray();
		for(int i=0; i<strArr.length; i++) {
			System.out.printf("Char it index %d is %c \n", i, strArr[i]);
		}

	}

}
