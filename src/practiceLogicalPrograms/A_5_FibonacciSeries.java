package practiceLogicalPrograms;
import java.util.Scanner;
public class A_5_FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of iterations for Fibonacci Series ");
		long uprLmt= sc.nextLong();
		sc.close();
		int n1=-1, n2=1, sum=0;
		System.out.print("Fibonacci Series is: ");
		for (int i=1; i<=uprLmt; i++) {
			sum= n1+n2;
			System.out.print(sum+" ");
			n1=n2;
			n2=sum;
		}
	}
}
