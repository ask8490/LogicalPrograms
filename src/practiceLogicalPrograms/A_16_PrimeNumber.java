package practiceLogicalPrograms;

public class A_16_PrimeNumber {

	public static void main(String[] args) {
	
		for (int i=1;i<100;i++)
	    {
	    	int count=0;
	    	for(int j=2;j<=100;j++)
	    	{
	    	
	    		if(i%j==0)
	    		{
	    			count=count+1;
	    		
	    		}
	    	}
	    	if (count==1)
	    	 {
	    		 System.out.println("Prime Number is "+i);
	    	 }
	   
	    }
	 
	}
}