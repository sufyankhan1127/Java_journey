package Day01;

import java.util.Scanner;

public class p26 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] ar=new int[n];
		
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		System.out.println("Enter the value to find:");
		int l=scan.nextInt();
		
		int index=linearsearch(ar, n, l);
		
		System.out.println(index);
	}
	
	public static int linearsearch(int [] ar,int n,int l) {
		
		for(int i=0;i<n;i++) {
			if(ar[i]==l) {
				return i;
			}
		}
		
		return -1;
	}

}
