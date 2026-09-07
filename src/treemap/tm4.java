package treemap;

import java.util.Scanner;
import java.util.TreeMap;

public class tm4 {
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
		System.out.println("Enter the value of K");
		int k=scan.nextInt();
		findKNearest(ar, target,k);
	}
	
	public static void findKNearest(int[] ar,int target,int k) {
		TreeMap<Integer, Boolean> map=new TreeMap();
		
		for(int x:ar) {
			map.put(x, true);
		}
		
		
		
		for(int i=0;i<k;i++) {
			if(i==0) {
				
				System.out.print((i+1)+"st ");
			}
			else if(i==1) {
				System.out.print((i+1)+"nd ");
			}
			else if(i==2) {
				System.out.print((i+1)+"rd ");
			}
			else {
				System.out.print((i+1)+"th ");
			}
			Integer lowest=map.floorKey(target);
			Integer highest=map.ceilingKey(target);
			if(highest==null) {
				System.out.println("Nearest Value: "+lowest);
				map.remove(lowest);
			}
			else if(lowest==null) {
				System.out.println("Nearest Value: "+highest);
				map.remove(highest);
			}
			else {
				if(target-highest<=target-lowest) {
					System.out.println("Nearest Value: "+highest);
					map.remove(highest);
				}
				else {
					System.out.println("Nearest Value: "+lowest);
					map.remove(lowest);
				}
			}
		}
		
	}

}
