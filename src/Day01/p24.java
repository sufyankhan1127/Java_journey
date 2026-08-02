//print sum of even fibonacci series from 1 to 2x 

package Day01;

import java.util.Scanner;

public class p24 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		printFibonacci(x);
		
		
	}
	
	static void printFibonacci(int x) {
		
		int first=0;
		int second=1;
		int sum=0;
		
		for(int i=0;i<2*x;i++) {
			
			
			//x used for number of fibonacci series to be printed
			System.out.println(first+" ");
			int next=first+second;
			
			first=second;
			second=next;

			if(first%2==0) {
				sum=sum+first;
			}
			
		}
		
//		System.out.println(sum);
		
	}

}
