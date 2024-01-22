package app;
import java.util.Scanner;

public class Number5Digit {

	public static void main(String[] args) {
		System.out.print("Enter a 5 digit positive integer:");
		Scanner scnr = new Scanner(System.in);
		
		int fiveDigit = scnr.nextInt();
		int[] fiveDigitNums = new int[5];
		
		
		fiveDigitNums[0] = fiveDigit % 10;
		int nextNum = fiveDigit / 10;
		
		fiveDigitNums[1] = nextNum % 10;
		int nextNum1 = nextNum / 10;
		
		fiveDigitNums[2] = nextNum1 % 10;
		int nextNum2 = nextNum1 / 10;
		
		fiveDigitNums[3] = nextNum2 % 10;
		int nextNum3 = nextNum2 / 10;
		
		fiveDigitNums[4] = nextNum3 % 10;
		int nextNum4 = nextNum3 / 10;
		
		int sum = 0;
		for (int i=0;i<4;i++) {
			System.out.print(fiveDigitNums[4-i] + " + ");
			sum = sum + fiveDigitNums[4-i];
		}
		System.out.print(fiveDigitNums[0] + " = ");
		sum = sum + fiveDigitNums[0];
		System.out.print(sum);
	}

}
