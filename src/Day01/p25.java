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
