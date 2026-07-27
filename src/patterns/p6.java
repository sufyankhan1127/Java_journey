//number pattern 2
//           1
//        2  3
//     4  5  6
//  7  8  9 10
// 11 12 13 14


package patterns;
import java.util.Scanner;

public class p6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int no=1;
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("    ");
				
			}
			
			for(int k=0;k<=i;k++) {
				System.out.printf("%4d",no);//printf reserves three spaces 
				no++;
			}
			
			System.out.println();
		}
	}

}
