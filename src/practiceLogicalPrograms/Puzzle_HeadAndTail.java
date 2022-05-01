package practiceLogicalPrograms;
/*There are 1100 coins with one side as heads and other side as tails and there are 1100 people
First person goes and places all the coins to show heads
Second person goes and places every second coin (2, 4, 6, ...) to show tails,
The third person goes to every third coin (3, 6, 9, ...) and, if it is heads, then places it to show tails, and if it is tails, then places it to show Heads
The fourth person does this to every fourth coin (4, 8, 12, ...), and so on.
After all the 1100 people take their turn how many coins will be showing heads?*/


public class Puzzle_HeadAndTail {

	public static void main(String[] args) {
		int limit = 1100;
		char coinFace[] = new char[limit+1];
		int countH=0;
		int countT=0;
		for (int i=1; i<=1100; i++) {
			coinFace[i] = 'H';
		}
		for (int i=1; i<=1100; i++) {
			System.out.print(coinFace[i]+" ");
		}
		face:
		for (int j=2; j<=1100; j++) {
			for (int k=1; j*k<=1100; k++) {
				if (coinFace[j*k]=='H') {
					coinFace[j*k]='T';
				}
				else if (coinFace[j*k]=='T') {
					coinFace[j*k]='H';
				}
				else {
					System.out.println("something is wrong");
					break face;
				}
			}
		}
		System.out.println();
		
		for (int i=1; i<=1100; i++) {
			System.out.print(coinFace[i]+" ");
			if (coinFace[i]=='H') {
				countH++;
			}
			if (coinFace[i]=='T') {
				countT++;
			}
		}
		System.out.println("\nHeads count of coins is: "+countH);
		System.out.println("\nTails count of coins is: "+countT);
	}

}
