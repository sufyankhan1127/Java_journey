package DSA;

import java.util.Scanner;

public class dsa3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=scan.nextInt();
		int [] ar=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element "+(i+1));
			ar[i]=scan.nextInt();
		}
		
		movezeroes(ar);
	}
	
	public static void movezeroes(int [] ar) {
		int j=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=0) {
				int temp=ar[i];
				ar[i]=ar[j];
				
				ar[j]=temp;
				j++;
			}
		}
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]+" ");
		}
	}

}
