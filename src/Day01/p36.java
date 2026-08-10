package Day01;

import java.util.Scanner;

public class p36 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int [] ar=new int[n];
		
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		
		printLarSmal(ar);
	}
	
	public static void printLarSmal(int [] ar) {
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>largest) {
				largest=ar[i];
			}
			
			
			if(ar[i]<smallest) {
				smallest=ar[i];
			}
		}
		
		System.out.println("Largest: "+largest);
		System.out.println("Smallest: "+smallest);
	}

}
