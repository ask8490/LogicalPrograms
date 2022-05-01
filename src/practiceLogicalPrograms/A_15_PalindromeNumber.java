package practiceLogicalPrograms;

public class A_15_PalindromeNumber {

	public static void main(String[] args) {
		int a=121,rev=0,rem;
		int temp=a;
		  System.out.println("**********Given Number is Palindrome Number or not **********");
		while(temp !=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(a==rev)
		{
			System.out.println("Given Number is Palindrome Number "+a);
		}
		else
			System.out.println("Given Number is not Palindrome Number "+a);
	}
}
