package practiceLogicalPrograms;

import java.util.*;

public class TryForEach {

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int num[]= new int [10];
		for (int i:num) {
			 i= rd.nextInt();
			 //System.out.print(i+" ");
		}
		System.out.println();
		for (int i= 0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}
}
