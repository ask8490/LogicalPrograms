package practiceLogicalPrograms;

import java.util.Scanner;

public class A_8_FindDuplicatesNosFromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an array of 8 numbres: ");
		int numAr[] = new int[8];
		for (int i=0; i<numAr.length; i++) {
			numAr[i]= sc.nextInt();
		}
		sc.close();
		int count;
		for (int i=0; i<numAr.length-1; i++) {
			count = 0;
			for (int j=i+1; j<numAr.length; j++) {
				if (numAr[i]==numAr[j]) {
					count++;
					numAr[j]=-2147483648;
				}
			}
			if (count>0 && numAr[i]!=-2147483648) {
				System.out.println(numAr[i]+" has duplicates in array");
			}
		}
	}

}
