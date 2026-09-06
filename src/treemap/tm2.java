//find the floor and ceiling

package treemap;

import java.util.Scanner;
import java.util.TreeMap;

public class tm2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n=scan.nextInt();
		int[] ar=new int[n];
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter the value of "+(i+1));
			ar[i]=scan.nextInt();
		}
		System.out.println("Enter the target value:");
		int target=scan.nextInt();
		
		floorAndCeil(ar, target);
	}
	
	public static void floorAndCeil(int [] ar,int target) {
		TreeMap<Integer,Integer> map=new TreeMap();
		for(int x:ar) {
			map.put(x, 1);
		}
		
		System.out.println("Floor = "+map.floorKey(target));
		System.out.println("Ceiling = "+map.ceilingKey(target));
	}
	
	

}
