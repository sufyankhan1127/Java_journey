package Day02;

import java.util.Scanner;

public class p8 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		
		System.out.println(maxProfit(arr));
	}
	
	static int maxProfit(int [] arr) {
		int maxprofit=0;
		int minprice=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minprice) {
				minprice=arr[i];
			}
			
			int profit=arr[i]-minprice;
			
			if(profit>maxprofit) {
				maxprofit=profit;
			}
			
		}
		
		return maxprofit;
	}
}
