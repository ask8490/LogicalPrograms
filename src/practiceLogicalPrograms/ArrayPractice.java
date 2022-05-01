package practiceLogicalPrograms;
import java.util.Scanner;
public class ArrayPractice {

	public static void main(String[] args) {
		int number[]= new int[10];
		Scanner sc= new Scanner(System.in);
		//input for array
		for (int i=0; i<10; i++) {
			System.out.println("enter a number");
			number[i]=sc.nextInt();
		}
		
		/*number[0]=1;
		number[1]=2;
		number[2]=3;
		number[3]=4;
		number[4]=5;*/
		
		for (int i=0; i<11; i++) {
			System.out.print(number[i]);
		}
		sc.close();

	}

}
