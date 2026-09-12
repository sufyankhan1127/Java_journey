//reverse an array using two pointers

package DSA;

import java.util.Scanner;

public class dsa1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		
		int [] res=reversearray(ar);
		
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}
	
	public static int [] reversearray(int[] ar) {
		if(ar==null) {
			return null;
		}
		int st=0;
		int end=ar.length-1;
		while(st<end) {
			int temp=ar[st];
			ar[st]=ar[end];
			ar[end]=temp;
			st++;
			end--;
		}
		
		return ar;
	}
}
