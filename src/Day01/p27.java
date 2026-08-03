package Day01;

import java.util.Scanner;

public class p27 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n=scan.nextInt();
		int [] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		System.out.println("Enter the value to find");
		int x=scan.nextInt();
		
		int result=Binarysearch(ar, n, x);
		
		System.out.println(result);
	}
	
	public static int Binarysearch(int [] ar,int n,int x) {
		int l=0;
		int r=n-1;
		
		while(l<=r) {
			
			int m=(l+r)/2;
			
			if(ar[m]==x) {
				return m;
			}
			
			else if(ar[m]>x) {
				r=m-1;
			}
			
			else {
				l=m+1;
			}
		}
		
		return -1;
	}

}
