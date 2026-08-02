package Day01;

import java.util.Scanner;

public class p23 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		printFibonacci(x);
		
		
	}
	
	static void printFibonacci(int x) {
		
		int first=0;
		int second=1;
		
		for(int i=0;i<x;i++) {
			
			//x used for number of fibonacci series to be printed
			/*System.out.println(first+" ");
			int next=first+second;
			
			first=second;
			second=next;*/
			
			//x used for printing less than x fibonacci series
			if(first<x) {
				System.out.println(first+" ");
				int next=first+second;
				
				first=second;
				second=next;
				
				
			}
			
		}
		
	}

}
