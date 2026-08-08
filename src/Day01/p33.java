package Day01;

import java.util.Scanner;

public class p33 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size of the array :");
		
		int n=scan.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		
		System.out.println(maxPairSum(ar));
		
	}
	
	public static int maxPairSum(int[] ar) {
		int largest=Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>largest) {
				secondlargest=largest;
				largest=ar[i];
			}
			
			if(ar[i]>secondlargest && ar[i]<largest) {
				secondlargest=ar[i];
			}
		}
		
		return largest+secondlargest;
	}

}
