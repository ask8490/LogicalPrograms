package practiceLogicalPrograms;

public class A_14_LcmandHcm {
	public static void main(String[] args) {
		int a=30,b=42,g=0;
		for (int i=2;i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
					g=i;			
			}
		}
		System.out.println("Highest Common Factor of above two Numbers is "+g);
		System.out.println("LCM of above two Number is "+((a*b)/g)); 
		
	}

}
