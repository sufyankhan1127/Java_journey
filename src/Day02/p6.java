package Day02;

import java.util.Scanner;

public class p6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		
		removeDups(arr);
	}
	
	static void removeDups(int [] arr) {
		int j=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[j]) {
				j++;
				arr[j]=arr[i];
			}
		}
		
		for(int i=0;i<=j;i++) {
			System.out.println(arr[i]);
		}
	}
}
