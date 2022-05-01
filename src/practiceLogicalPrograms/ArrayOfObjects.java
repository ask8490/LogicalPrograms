package practiceLogicalPrograms;

public class ArrayOfObjects {
	public static void main (String [] args) {
		Object arr []= {"Aniket", 'A', 1, 1.25};
		for (Object i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		int sum = 1+ (int)arr[2]; 
		System.out.println(sum);
	}
}
