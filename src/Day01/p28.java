package Day01;

import java.util.Scanner;

public class p28 {
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
		int l=0;
		int r=n-1;
		
		int result=recursivesearch(ar,l,r, n, x);
		
		System.out.println(result);
	}
	
	public static int recursivesearch(int [] ar,int l,int r,int n,int x) {
		
		
		if(r<l) {
			return -1;
		}
		
		if(ar[l]==x) {
			return l;
		}
		
		if(ar[r]==x) {
			return r;
		}
		
		return recursivesearch(ar,l+1,r-1, n, x);
	}

}
