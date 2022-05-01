package practiceLogicalPrograms;

import java.util.Arrays;
import java.util.Random;

public class A_18_SortingArrayInDescendingOrder {

	public static void main(String[] args) {
		int num[]= new int[15];
		Random rd= new Random();
		System.out.print("Array of numbers between 0 to 50: ");
		for (int i=0; i<num.length; i++) {
			num [i]=rd.nextInt(50);
			System.out.print(num[i]+" ");
		}
		Arrays.sort(num);
		System.out.print("\nSorted Array in Descending Order: ");
		for (int i=num.length-1; i>=0; i--) {
			System.out.print(num[i]+" ");
		}
	}

}
