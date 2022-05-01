package practiceLogicalPrograms;

public class Armstrong_3and4dgt_whileLoop2 {

	public static void main(String[] args) {
		int i=2;
		while (i<=999){
			long num=i;
			long digit, sum=0;
			int j=0;
			while (j<3) {
				digit = num%10;
				sum = (long) (sum + Math.pow(digit, 3));
				num = num/10;
				j++;
			}
			if (sum==i) {
				System.out.println(i +" is a 3 digit Armstrong Number");
			}
			i++;
		}
		int k=2;
		while (k<=9999){
			long num=k;
			long digit, sum=0;
			int j=0;
			while (j<4) {
				digit = num%10;
				sum = (long) (sum + Math.pow(digit, 4));
				num = num/10;
				j++;
			}
			if (sum==k) {
				System.out.println(k +" is a 4 digit Armstrong Number");
			}
			k++;
		}
	}

}
