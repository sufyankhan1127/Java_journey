//pattern 8
//   *
//  ***
// ***** 



package patterns;

import java.util.Scanner;

public class p8 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int no=2;
		for(int i=0;i<n;i++) {
			for(int k=0;k<n-i-1;k++) {
				
				System.out.print(" ");
				
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
			no+=2;
					
		}
	}

}
