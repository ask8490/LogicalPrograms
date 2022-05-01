package practiceLogicalPrograms;
import java.util.*;
public class A_10_LargestNoFromArray {
	public static void main(String[] args) {
		int num[]= new int[15];
		Random rd= new Random();
		System.out.print("Array of numbers between 0 to 50: ");
		for (int i=0; i<num.length; i++) {
			num [i]=rd.nextInt(50);
			System.out.print(num[i]+" ");
		}
		int max=num[0];
		for (int i:num) {
			if(i>=max) {
				max=i;
			}
			
		}
		System.out.println("\nmax number is: "+max);
	}

}
