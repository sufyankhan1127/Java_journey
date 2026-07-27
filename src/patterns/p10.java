//pattern 10
//5
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *



package patterns;
import java.util.Scanner;

public class p10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<2*(n-i)-1;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
