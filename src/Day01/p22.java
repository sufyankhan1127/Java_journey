//Check whether the given number is neon number;

package Day01;

import java.util.Scanner;

public class p22 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		NeonNumber(n);
	}
	
	public static void NeonNumber(int n) {
		
		int original=n;
		int square=n*n;
		
		int temp=square;
		int sqsum=0;
		while(temp>0) {
			int digit=temp%10;
			sqsum=sqsum+digit;
			temp=temp/10;
		}
		
		if(sqsum==original) {
			System.out.println("Neon Number");
		}
		else {
			System.out.println("Not a Neon Number");
		}
	}

}
