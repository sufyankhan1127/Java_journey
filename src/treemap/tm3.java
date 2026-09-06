
//find nearest number to the target 
package treemap;

import java.util.Scanner;
import java.util.TreeMap;

public class tm3 {
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
	}
	
	public static void findNearest(int[] ar , int target) {
		Integer target2=target;
		TreeMap<Integer, Boolean> map=new TreeMap();
		for(int x:ar) {
			map.put(x, true);
			
		}
		
		Integer lowest=map.floorKey(target);
		Integer highest=map.ceilingKey(target);
		
		if(highest==null) {
			System.out.println(lowest);
		}
		else if(lowest==null) {
			System.out.println(highest);
		}
		
		else {
			if(target-lowest<=target-highest){
				System.out.println(lowest);
			}
			else {
				System.out.println(highest);
			}
		}
	}

}
