package practiceLogicalPrograms;
//import java.util.Scanner;
public class FunctionsAndMethods {

	void addNumbers(int a, int b) {
		int sum=a+b;
		System.out.println("addition of two numbres is: " + sum);
	}
	public void productOfNumbers(int a, int b) {
		int prod= a* b;
		System.out.println("1st class method o/p: "+ prod);
	}
	public static int factorialOfNumber(int n) {
		int facto=1;
		for (int i=n; i>=1; i--) {
			facto= facto*i;
		}
		return facto;
	}
	public static void checkPrime(int num) {
		int rem=0;
		for (int i=2; i<num; i++) {
			rem=num%i;
			if (rem==0) {
				System.out.println(num+ " is not prime");
				return;
			}
		}
		if (rem!=0) {
			System.out.print(num+ " is Prime Number");
		}
	}
	public static void printTable(int a) {
		for (int i=1; i<=10; i++) {
			int prod = a*i;
			System.out.println(a +"X"+ i + "=" + prod);
		}
	}
	public static void caluclateAvg(int a,int b,int c) {
		float avg = (a+b+c)/3;
		System.out.println("Average of given numbers is "+ avg);
	}
	public static void oddNumbersSum(int a) {
		int oddSum=0;
		for (int i=1; i<=a; i++) {
			if (i%2!=0) {
				oddSum=oddSum+ i;
			}
			else {
				continue;
			}
		}
		System.out.printf("Sum of Odd Numbers upto %d is %d", a,oddSum );
	}
	public static void greaterNumber(int a, int b) {
		if (a>b) {
			System.out.println("Greater Number is "+ a);
			return;
		}
		else if(b>a) {
			System.out.println("Greater Number is "+ b);
			return;
		}
		else {
			System.out.println("Numbers are equal");
		}
	}
	
	public static void main(String[] args) {
		/*
		FunctionsAndMethods obj = new FunctionsAndMethods();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1= sc.nextInt();
		System.out.println("Enter Second Number: ");
		int num2= sc.nextInt();
		obj.addNumbers(num1, num2);
		sc.close();
		
		int prod= productOfNumbers(num1, num2);
		System.out.println("product of two numbres is: " + prod);
		
		int facto1= factorialOfNumber(num1);
		System.out.println("Factorial of first number is: "+ facto1);
		
		int facto2= factorialOfNumber(num2);
		System.out.println("Factorial of first number is: "+ facto2);
		
		int num= sc.nextInt();
		checkPrime(num);
		
		System.out.println("Enter a number to print table: ");
		int x= sc.nextInt();
		printTable(x);
		
		System.out.println("Enter 3 numbers : ");
		int a1= sc.nextInt();
		int a2= sc.nextInt();
		int a3= sc.nextInt();
		caluclateAvg(a1, a2, a3);
		
		System.out.println("Enter a number to print sum of odd numbers: ");
		int a4= sc.nextInt();
		oddNumbersSum(a4);
		
		System.out.println("Enter 2 numbers : ");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		greaterNumber(num1, num2);
		sc.close();
		
		short a=1;
		do {
			System.out.println(a);
			a++;
		}
		while (a>=0);
		
		//calculating x to the power n
		System.out.println("Enter 2 numbers : ");
		int x= sc.nextInt();
		int n= sc.nextInt();
		int ans=1;
		for (int i=1; i<=n; i++) {
			ans=ans*x;
		}
		System.out.println(x+ " to the power " + n + " is "+ ans);
		*/
		VarTypes.addition();
		VarTypes obj1= new VarTypes();
		obj1.difference();
	}

}
