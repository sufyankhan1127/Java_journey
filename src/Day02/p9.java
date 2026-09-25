package Day02;

import java.util.Scanner;

public class p9 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		
		System.out.println(voting(arr));
	}
	
	static int voting(int[] arr) {
		int candidate=0;
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(count==0) {
				candidate=arr[i];
			}
			
			if(candidate==arr[i]) {
				count++;
			}
			else {
				count--;
			}
		}
		
		return candidate;
	}
}
