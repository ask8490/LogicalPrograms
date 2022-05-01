package practiceLogicalPrograms;
import java.util.*;
//import java.lang.Math;
public class patternPrints extends FunctionsAndMethods {
	public static void main(String[] args) {
/*		
		//solid rectangle pattern
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows: ");
		int row= sc.nextInt();
		System.out.println("enter number of columns: ");
		int col= sc.nextInt();
		for (int i=1; i<=row; i++) {
			for (int j=1; j<=col; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
*/
/*		//hollow Rectangle pattern
		int row=5;
		int col=5;
		for (int i=1; i<=row; i++) {
			for (int j=1; j<=col; j++) {
				if (i==1 || j==1 || i==5 || j==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
*/
/*		//half vertical pyramid
		int row=4;
		for (int i=1; i<=row; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
*/
/*		//half inverted pyramid
		int row1=3;
		for (int i=1; i<=row1; i++) {
			for (int j=row1; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
*/
		//half vertical pyramid 180 degree rotated
/*		int row=4;
		for (int i=1; i<=row; i++) {
			for (int j=1; j<=row; j++) {
				if ((i+j)>row) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
*/
/*		//another method for above program
		int row=4;
		//outer loop
		for (int i=1; i<=row; i++) {
			//inner loop for spaces
			for (int j=1; j<=row-i; j++) {
				System.out.print(" ");
			}
			// inner loop for *s
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
*/
	/*	* * * * *
		 * * * *
		  * * *
		   * *
		    *
	
		int row =5;
		for (int i=1; i<=row; i++) {
			for (int space= 1; space<=i; space++) {
				System.out.print(" ");
			}
			for (int star=row; star>=i; star--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
*/		
/*	        *
		   * *
		  * * *
         * * * *
  		* * * * * 
		 * * * *
		  * * *
		   * *
		    *
*/	
/*		int uppperLines=5;
		for (int i=1; i<=uppperLines; i++) {
			for (int space= (uppperLines-i); space>=1; space--) {
				System.out.print(" ");
			}
			for (int star=1; star<=i; star++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		int lowerLines =4;
		for (int i=1; i<=lowerLines; i++) {
			for (int space= 1; space<=i; space++) {
				System.out.print(" ");
			}
			for (int star=lowerLines; star>=i; star--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
*/				
/*
		//numbers in vertical
		int row=5;
		for (int i=1; i<=row; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
*/		
/*
		//inverted pyramid with numbers
		int row=5;
		for (int i=1; i<=row; i++) {
			for (int j=1; j<=row-i+1; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
*/	
/*		//floyd's Triangle
		int row=5;
		int num=1;
		for (int i=1; i<=row; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
*/
/*		//0-1 Triangle
		int row=5;
		int print=1;
		for (int i=1; i<=row; i++) {
			for (int j=1; j<=i; j++) {
				
				if ((i+j)%2==0) {
					System.out.print(1+" ");
				}
				else {
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
*/
/*		//solid star rhombus
		int row=5;
		for (int i=1; i<=row; i++) {
			//for spaces
			for (int j=1; j<=row-i; j++) {
				System.out.print(" ");
			}
			//for stars
			for (int j=1; j<=row; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
*/		
/*		//Number Pyramid
		int row=5;
		for (int i=1; i<=row; i++) {
			//for spaces
			for (int j=1; j<=row-i; j++) {
				System.out.print(" ");
			}
			//for number printing
			for (int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
*/		
/*		//palindromic number pyramid
		int row=5;
		for (int i=1; i<=row; i++) {
			//for spaces
			for (int j=1; j<=row-i; j++) {
				System.out.print("  ");
			}
			//for reverse number
			for (int j=i; j>=1; j-- ) {
				System.out.print(j+" ");
			}
			//for forward print
			for (int j=2; j<=i; j++) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
*/
/*
		//Butterfly Pattern
		int n=4;
		for (int i=1; i<=n; i++) {
			//for top left stars
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			//for upper middle spaces
			for (int j=2*(n-i); j>0; j--) {
				System.out.print("  ");
			}
			//for top right star
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=n-1; i>=1; i--) {
			//for bottom left stars
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			//for lower middle spaces
			for (int j=2*(n-i); j>0; j--) {
				System.out.print("  ");
			}
			//for bottom right star
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
*/
/*		//diamond star pattern
		int n=4;
		for (int i=1; i<=n; i++) {
			//for spaces
			for (int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			//for stars
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=n; i>=1; i--) {
			//for spaces
			for (int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			//for stars
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
*/
/*
		//Hollow Butterfly
		int n=5;
		for (int i=1; i<=n; i++) {
			//for left triangle
			for(int j=1; j<=i; j++) {
				if (j==1 || j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			//for spaces
			for (int j=1; j<=2*(n-i); j++){
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				if (j==1 || j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
			
		}
		for (int i=n; i>=1; i--) {
			//for left triangle
			for(int j=1; j<=i; j++) {
				if (j==1 || j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			//for spaces
			for (int j=1; j<=2*(n-i); j++){
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				if (j==1 || j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
			
		}
*/
/*
		//hollow rhombus
		int n=5;
		for (int i=1; i<=n; i++) {
			// for spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			//for stars
			for (int j=1; j<=n; j++) {
				if (j==1 || j== n ||i==1 || i==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
*/	
/*		//Pascal's Triangle
		int n=6;
		for (int i=0; i<n; i++) {
			//for left spaces
			for (int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			//for pascal's triangle
			long num=1;
			for (int k=0; k<=i; k++) {
				System.out.print(num+" ");
				num=num*(i-k)/(k+1);
			}
			System.out.println();
		}
*/
/*
		//half pyramid
		int n=5;
		for (int i=1; i<=n; i++) {
			//for empty spaces
			for (int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			// for number printing
			int num=1;
			for (int j=1; j<=i; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
*/
/*
		//inverted half pyramid
		int n=5; 
		for (int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
*/
	}
}
