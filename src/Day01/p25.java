//Input: n = 4
//Output: 33
//N = 4, So here the fibonacci series will be produced from 0th term till 8th term:
//0, 1, 1, 2, 3, 5, 8, 13, 21
//Sum of numbers at even indexes = 0 + 1 + 3 + 8 + 21 = 33.
//
//Input: n = 7
//Output: 609
//0 + 1 + 3 + 8 + 21 + 55 + 144 + 377 = 609.


package Day01;

import java.util.Scanner;

public class p25 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		int[] ar=new int[2*n+1];
		FibArray(ar, n);
		
	}
	
	public static void FibArray(int[] ar,int n) {
		for(int i=0;i<2*n+1;i++) {
			int first=0;
			int second=1;
			
			for(int j=0;j<2*n+1;j++) {
				ar[j]=first;
				int next=first+second;
				first=second;
				second=next;
			}
		}
		
		int sum=0;
		
		
		for(int i=0;i<2*n+1;i++) {
			if(i%2==0) {
				sum=sum+ar[i];
			}
		}
		
		System.out.println(sum);
	}

}
