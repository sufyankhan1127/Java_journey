//Majority element in the array 
//nums:1,1,2,2,2,1
//output:2

package leetcode150;

import java.util.HashMap;
import java.util.Scanner;

public class l5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int [] ar=takeinput(scan);
		
		System.out.println("Majority element using method 1:");
		System.out.println(method1(ar));
		System.out.println("Majority element using method 2:");
		System.out.println(method2(ar));
		
	}
	
	public static int[] takeinput(Scanner scan) {
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the element "+(i+1));
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
	
	public static int method2(int [] ar) {
		HashMap<Integer, Integer> map=new HashMap<>();
		
		for(int i=0;i<ar.length;i++) {
			map.put(ar[i], map.getOrDefault(ar[i], 0)+1);
			
			if(map.get(ar[i])>ar.length/2) {
				return ar[i];
			}
		}
		return -1;
	}

}
