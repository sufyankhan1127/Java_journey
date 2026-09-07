package treemap;

import java.util.Scanner;
import java.util.TreeMap;

public class tm5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n=scan.nextInt();
		int[] ar=new int[n];
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter the value of "+(i+1));
			ar[i]=scan.nextInt();
		}
		
		printSubMap(ar, scan);
	}
	
	public static void printSubMap(int [] ar,Scanner scan) {
		System.out.println("Enter the first value to find in between elements");
		int first=scan.nextInt();
		System.out.println("Enter the last value to find in between elements");
		int last=scan.nextInt();
		TreeMap<Integer, Boolean> map=new TreeMap();
		
		for(int x:ar) {
			map.put(x, true);
		}
		
		System.out.println("Value between "+first +"and" + last+ " are :");
		System.out.println(map.subMap(first, last));
		System.out.println(map.subMap(first, true, last, true));
	}
}
