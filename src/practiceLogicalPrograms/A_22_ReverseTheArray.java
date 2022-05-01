package practiceLogicalPrograms;

import java.util.Random;

public class A_22_ReverseTheArray {

	public static void main(String[] args) {
		Random rd = new Random();
		System.out.print("Random Integer array: ");
		int ar1[] = new int [5];
		for (int i=0; i<ar1.length; i++) {
			ar1[i] = rd.nextInt(50);
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		System.out.print("Reversed Array: ");
		/*for (int j=ar1.length-1; j>=0; j--) {
			System.out.print(ar1[j]+" ");
		}*/
		
		int ar2[] = new int[5];
		for (int i= ar1.length-1; i>=0; i--) {
			switch(i) {
				case(4):{
					ar2[0] = ar1[i];
				}
				case(3):{
					ar2[1] = ar1[i];
				}
				case(2):{
					ar2[2] = ar1[i];
				}
				case(1):{
					ar2[3] = ar1[i];
				}
				case(0):{
					ar2[4] = ar1[i];
				}
			}
		}
		
		for (int k:ar2) {
			System.out.print(k+" ");
		}
	}
}
