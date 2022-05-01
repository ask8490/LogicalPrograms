package practiceLogicalPrograms;

import java.util.Scanner;

public class StringCharCount {

	public static void main(String[] args) {
		System.out.println("Enter a sentense: ");
		Scanner sc = new Scanner (System.in);
		String str= sc.nextLine();
		sc.close();
		String st[]= str.split("");
		int counter;
		for (int i=0; i<st.length; i++) {
			counter=1;
			for (int j=i+1; j<st.length; j++) {
				if (st[i].equals(st[j])) {
					counter++;
					st[j]="0";
				}
			}
			if (counter>0 && st[i]!="0") {
				System.out.println(st[i]+ " is repeated by "+ counter + " times");
			}
		}
		
		

	}

}
