package practiceLogicalPrograms;

public class VarTypes {
	int x=20;
	static int y =30;
	static void addition() {
		int a1=15;
		int a2=25;
		int sum;
		sum=a1+a2;
		System.out.println("Addition is: "+ sum);
	}
	
	void difference() {
		float a1=15.25f;
		double a2=25.2525;
		double diff;
		diff =a2-a1;
		System.out.println("Difference is: "+ diff);
	}
	public static void main(String[] args) {
	VarTypes obj = new VarTypes();
		System.out.println(obj.x);
		System.out.println(y);
		addition();
		obj.difference();
		obj.x=30;
		System.out.println(obj.x);
		VarTypes.y=45;
		System.out.println(y);
		
		
	}

}
