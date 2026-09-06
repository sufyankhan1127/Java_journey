//frequency counting and sorted order

package treemap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class tm1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n=scan.nextInt();
		int[] ar=new int[n];
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter the value of "+(i+1));
			ar[i]=scan.nextInt();
		}
		
		findOccandSort(ar);
	}
	
	public static void findOccandSort(int[] ar) {
		TreeMap<Integer, Integer> map=new TreeMap();
		
		for(int x:ar) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> x:map.entrySet()) {
			System.out.println(x.getKey()+" -> "+x.getValue());
		}
	}

}
