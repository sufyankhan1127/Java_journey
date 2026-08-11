//remove value from an array and print the array

//input=n=5
//1,2,4,5,2
//
//value=2;
//
//output:1,4,5


package leetcode150;

import java.util.Scanner;

public class l1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		returnnewArray(scan);
		
	}
	
	public static void returnnewArray(Scanner scan) {
		int n=scan.nextInt();
		int [] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		
		int value=scan.nextInt();
		
		int count=0;
		
		for(int i=0;i<n;i++) {
			if(ar[i]!=value) {
				ar[count]=ar[i];
				count++;
			}
		}
		
		for(int i=0;i<count;i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
