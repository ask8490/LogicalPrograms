package practiceLogicalPrograms;

import java.util.*;

public class A_10_to_13_17_ArrayPrograms {

	public static void main(String[] args) {
	
	ArrayList al = new ArrayList();	
	HashSet hs = new HashSet();
	LinkedHashSet lhs = new LinkedHashSet();
	TreeSet ts = new TreeSet();
	int a []= {5,3,8,20,30,5,20,26};
	 int 	max =a[0];
   int min=a[0];
  	for (int i=0;i<a.length;i++)
	{
		if (max<a[i])
		{
			max=a[i];
		}
		if (min>a[i])
		{
			min=a[i];
		}
		
	}
 /*System.out.println("Largest number in Array is " + max);
 System.out.println("Smallest number in Array is " + min);
 Arrays.sort(a);
 System.out.println("2nd Largest number in Array is "+ a[1]);
 System.out.println("3rd Largest number in Array is "+ a[2]);
 System.out.println("4th Largest number in Array is "+ a[3]);*/
 System.out.print("Prime Number form given Arrys is: ");
    for (int i=0;i<a.length;i++)
    {
    	int count=0;
    	for(int j=2;j<=max;j++)
    	{
    	
    		if(a[i]%j==0)
    		{
    			count=count+1;
    		
    		}
    	}
    	if (count==1)
    	 {
    		 al.add(a[i]);
    		 hs.add(a[i]);
    		 lhs.add(a[i]);
    		 ts.add(a[i]);
    		 
    	 }
   
    }
    System.out.println(al);
    System.out.println(hs);
    System.out.println(lhs);
    System.out.println(ts);
 
	}

}
