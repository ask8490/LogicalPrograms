package practiceLogicalPrograms;

public class A_37_StarDimandPattern {
	public static void main(String[] args) 
	{
		for (int row=1;row<=5;row++)
		{
			for(int space=4;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int star=1;star<=row;star++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int row=6;row<=9;row++)
		{
			for(int space=1;space<=row-5;space++)
			{
				System.out.print(" ");
			}
			for(int star=4;star>=row-5;star--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
