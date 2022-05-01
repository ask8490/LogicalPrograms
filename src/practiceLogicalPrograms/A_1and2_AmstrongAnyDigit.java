package practiceLogicalPrograms;
import java.util.Scanner;
public class A_1and2_AmstrongAnyDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Upper limit to find Armstrong Number: ");
		long uprLmt= sc.nextLong();
		sc.close();
		for (long i=1; i<=uprLmt; i++){
			long num= i;
			long num2= i;
			double temp=num2;
			double sum=0;
			int digitCounter= 0;
			while (num>0){		//counting digits in the given number
				//double d= num%10;
				digitCounter++;
				num= num/10;
			}
			while (num2>0){		//calculation for Armstrong number series
				double digit= num2%10;
				sum=(sum + Math.pow(digit, digitCounter));
				num2= num2/10;
			}
			if (sum==temp){		//condition for printing Armstrong number 
				System.out.printf(temp+" is armstrong number for %d digit number\n",digitCounter);
			}
		}
	}
}
