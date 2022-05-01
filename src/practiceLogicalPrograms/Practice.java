package practiceLogicalPrograms;
import java.util.*;
import java.lang.Math;
public class Practice {

	public static void main(String[] args) {

		//Swaping variable values 
		int a,b;
		int temp=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value if a: ");
		a=sc.nextInt();
		System.out.println("Enter value of b: ");
		b=sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swaping a is "+ a+" and b is "+ b);
		sc.close();
		
/*		//Printing face
		String[] face=new String [5];
		face[0]=" +\"\"\"\"\"+ ";
		face[1]="[| o o |]";
		face[2]=" |  ^  | ";
		face[3]=" | '-' | ";
		face[4]=" +-----+ ";
		for (int i=0; i<5; i++) {
			System.out.println(face[i]);
		}
*/		
/*		// Calculator
		char opr;
		double num1, num2,result;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value if first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter value of second number: ");
		num2 = sc.nextInt();
		System.out.println("select the operation to perform: \n+ for Addition\n"
				+ "- for Substraction\n* for Multiplication\n/ for Division\n% for modulus");
		opr=sc.next().charAt(0);
		switch (opr) {
			case '+':
				result= num1+num2;
				System.out.println("Answer is: "+result);
				break;
			case '-':
				result= num1-num2;
				System.out.println("Answer is: "+result);
				break;
			case '*':
				result= num1*num2;
				System.out.println("Answer is: "+result);
				break;
			case '/':
				result= num1/num2;
				System.out.println("Answer is: "+result);
				break;
			case '%':
				result= num1/num2;
				System.out.println("Answer is: "+result);
				break;
			default:
				System.out.println("Invalid Operation");
				break;
		}
		sc.close();
*/		
/*		// Printing Fibonacci Series
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2);
		for (int i=2; i<25; i++) {
			int n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
*/		
/*		//Checking whether the given number is prime
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int rem=0;
		for (int i=2; i<num; i++) {
			rem=num%i;
			if (rem==0) {
				System.out.println(num+ " is not prime");
				break;
			}
		}
		if (rem!=0) {
			System.out.print(num+ " is Prime Number");
		}
		sc.close();
*/		
		//check the number for palindrome
/*		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		long num=sc.nextLong();
		long ans= 0;
		long temp=num;
		while (num!=0) {
			long rem=num%10;
			num=num/10;
			ans =ans*10+rem;
		}
		if (ans==temp) {
			System.out.printf("%d is a palindrome number", temp);
		}
		else {
			System.out.printf("%d is not a palindrome number", temp);
		}
		sc.close();
*/		
/*		// Factorial of a number
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number: ");
		long num=sc.nextLong();
		long ans= 1;
		while (num>0) {
			ans=ans*num;
			num--;
		}
		System.out.println("Factorial of given number is: "+ ans);
		sc.close();
		
		//printing primes up to n
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int maxNum=sc.nextInt();
		for (int num=0; num<maxNum; num++) {
			int rem=0;
			for (int i=2; i<num; i++) {
				rem=num%i;
				if (rem==0) {
					//System.out.println(num+ " is not prime");
					break;
				}
			}
			if (rem!=0) {
				System.out.print(" "+ num);
			}
		}		
		sc.close();
*/
/*		//Armstrong Numbers uo to N
		Scanner sc= new Scanner(System.in);
		System.out.println("enter limit for Armstrong numbers: ");
		int limit=sc.nextInt();
		for (int num=0; num<limit; num++) {
			int temp = num;
			double desiCount=0;
			double sum = 0;
			while (temp!=0) {
				temp=temp/10;
				desiCount++;	
			}
		    temp=num;
		    while (temp>0) {
		    	double lstDgt=temp%10;
		    	sum =sum + Math.pow(lstDgt, desiCount);
		    	temp=temp/10;
		    }
		    if (sum==num) {
		    	System.out.print(num+" ");
		    }
		}
		sc.close();
*/		
	}
}
