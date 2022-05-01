package practiceLogicalPrograms;

import java.util.Scanner;

public class A_9_FindDuplicateStringFromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an array of 5 strings: ");
		String strAr[] = new String[5];
		for (int i=0; i<strAr.length; i++) {
			strAr[i]= sc.nextLine();
		}
		sc.close();
		for (int i=0; i<strAr.length; i++) {
			System.out.print(strAr[i]+" ");
		}
		int count;
		for (int i=0; i<strAr.length-1; i++) {
			count = 0;
			for (int j=i+1; j<strAr.length; j++) {
				if (strAr[i].equals(strAr[j])) {
					count++;
					strAr[j]="0";
				}
			}
			System.out.println();
			if (count>0 && strAr[i]!="0") {
				System.out.println(strAr[i]+" has duplicates in array");
			}
		}
	}
}
