//number pattern 3
//  3  6  2
//  9  4  6
//  8 10 12


package patterns;
import java.util.Scanner;

public class p7 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int twos=2;
		int threes=3;
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.printf("%3d",threes);
				threes+=3;

			}
			
			for(int k=0;k<=i;k++) {
				System.out.printf("%3d",twos);
				twos+=2;

			}
			
			System.out.println();
		}
	}

}
