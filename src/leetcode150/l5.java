//Majority element in the array 
//nums:1,1,2,2,2,1
//output:2

package leetcode150;

import java.util.Scanner;

public class l5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int [] ar=takeinput(scan);
		
		System.out.println("Majority element:");
		System.out.println(method1(ar));
		
	}
	
	public static int[] takeinput(Scanner scan) {
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the eleemt "+(i+1));
			ar[i]=scan.nextInt();
		}
		
		return ar;
	}
	
	public static int method1(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			int count=0;
			for(int j=0;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					count++;
				}
			}
			
			if(count>ar.length/2) {
				return ar[i];
			}
			
		}
		
		return -1;
	}

}
