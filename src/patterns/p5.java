//number pattern 1



package patterns;
import java.util.Scanner;

//number pattern 1
//01 02 03 04
//05 06 07
//08 09
//10


public class p5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int no=1;
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n-i;j++) {
				if(no<10) {
					System.out.print("0"+ no+" ");
					no++;
				}
				else {
					System.out.print(no+" ");
					no++;
				}
			}
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			
			
			System.out.println();
		}
	}
	

}
