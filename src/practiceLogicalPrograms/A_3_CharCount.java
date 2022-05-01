package practiceLogicalPrograms;

public class A_3_CharCount {
	public static void main(String[] args) {
		String s="Aspire traning institute is best";
		String s1[]=s.split("");
		int count;
		for (int i=0; i<s1.length;i++)
		{
			count=1;
			for (int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					count=count+1;
					s1[j]="0";
				}
			}
			if(count>0 && s1[i]!="0")
			{
				System.out.println(s1[i]+" is appeared by "+count+" times");
			}
		}
		System.out.println("total number of charecters in string are: "+ s.length());
	}
}

