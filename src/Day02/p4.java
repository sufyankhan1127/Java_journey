package Day02;

import java.util.Scanner;

public class p4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		
		System.out.println("Sorting using bubble sort");
		
		int[] res=bubblesort2(ar);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]);
		}
	}
	
	public static int[] bubblesort2(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length-1;j++) {
				if(ar[j+1]>ar[j]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		
		return ar;
	}

}
