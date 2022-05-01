package practiceLogicalPrograms;

public class Operators {

	public static void main(String[] args) {
		int i= 5;
		
		//System.out.println(++i);
	//	System.out.println(i++);
		//System.out.println(i);
		for (int j=0; j<=10; ++j) {
			System.out.print(j+" ");
		}
		System.out.println();
		for (int j=0; j<=10; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
		while (i<=10) {
			System.out.print(i+" ");
			i++;
		}
		
		int num1= 10;
		int num2= 20;
		
		String result = (num1>num2) ? ("num1 is greater"):("num2 is greater");
		System.out.println(result);
	}

}
