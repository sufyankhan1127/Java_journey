package Day01;

import java.util.Scanner;

public class p34 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size of the array :");
		
		int n=scan.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		
		System.out.println("The minimum pair sum is:");
		System.out.println(minPairSum(ar));
		
	}
	
	public static int minPairSum(int[] ar) {
		int smallest=Integer.MAX_VALUE;
		int secondsmallest=Integer.MAX_VALUE;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<smallest) {
				secondsmallest=smallest;
				smallest=ar[i];
			}
			
			if(ar[i]<secondsmallest && ar[i]>smallest) {
				secondsmallest=ar[i];
			}
		}
		int result=smallest+secondsmallest;
		return result;
	}

}
