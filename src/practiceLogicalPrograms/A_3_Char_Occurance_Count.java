package practiceLogicalPrograms;

public class A_3_Char_Occurance_Count {

	public static void main(String[] args) {
		String s = "selenium testers team";
		char cr1= 's';
		int count= 0;
		for (int i=0; i<s.length(); i++) {
			char cr2= s.charAt(i);
			if (cr1==cr2) {
				count++;
			}
		}
		System.out.print(cr1 +" appears "+ count+ " times");
	}

}
