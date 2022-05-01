package practiceLogicalPrograms;

public class Armstrong_3and4dgt_forLoop {

	public static void main(String[] args) {
		
		for (int i=2; i<=999; i++){
			long num=i;
			long digit, sum=0;
			for (int j=0; j<3; j++) {
				digit = num%10;
				sum = (long) (sum + Math.pow(digit, 3));
				num = num/10;
			}
			if (sum==i) {
				System.out.println(i +" is a 3 digit Armstrong Number");
			}
		}
		for (int k=2; k<=9999; k++){
			long num=k;
			long digit, sum=0;
			for (int j=0; j<4; j++) {
				digit = num%10;
				sum = (long) (sum + Math.pow(digit, 4));
				num = num/10;
			}
			if (sum==k) {
				System.out.println(k +" is a 4 digit Armstrong Number");
			}
		}
	}

}
