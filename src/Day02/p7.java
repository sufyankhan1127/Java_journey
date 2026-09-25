package Day02;

import java.util.Scanner;

public class p7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		
		moveZeroes(arr);
	}
	
	public static void moveZeroes(int [] arr) {
		int j=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				j--;
			}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}

