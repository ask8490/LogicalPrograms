package practiceLogicalPrograms;

public class StringConcatWithReplace {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "selenium";
		
		System.out.println(s1.replace("j", "").concat(s2.replace("s", "")));
	}

}
