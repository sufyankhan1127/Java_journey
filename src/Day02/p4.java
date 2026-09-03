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
		System.out.println("Sorting using insertion sort");

		int[] res1=insertionsort(ar);
		for(int i=0;i<res1.length;i++) {
			System.out.print(res1[i]);
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
	
	public static int[] insertionsort(int[] ar) {
		for(int i=1;i<ar.length;i++) {
			int current =ar[i];
			int j=i-1;
			
			while(j>=0 && ar[j]>current) {
				ar[j+1]=ar[j];
				j--;
			}
			
			ar[j+1]=current;
		}
		
		return ar;
	}

}
