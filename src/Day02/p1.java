//sort elements in an array using bubble sort 

package Day02;

import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int n=scan.nextInt();

		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		System.out.println("Ascending order");
		bubblesortAscending(ar);
		System.out.println();
		System.out.println("Descending order");
		bubblesortDescending(ar);
	}

	public static void bubblesortAscending(int[] ar) {
		
		
		for(int i=0;i<ar.length-1;i++) {
			for(int j=0;j<ar.length-1-i;j++) {
				if(ar[j]>ar[j+1]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
			
			
			
		}
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		
	}
	
	public static void bubblesortDescending(int[] ar) {

		for(int i=0;i<ar.length-1;i++) {
			for(int j=0;j<ar.length-1-i;j++) {
				if(ar[j]<ar[j+1]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
			
			
			
		}
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}
}
