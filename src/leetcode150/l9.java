package leetcode150;

import java.util.Scanner;

public class l9 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] prices=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the price for stock"+(i+1));
			prices[i]=scan.nextInt();
		}
		
		int result=maxProfit(prices);
		System.out.println("Max profit that can be obtained:"+ result);
	}
	public static int maxProfit(int[] prices) {


        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){ 
               profit=profit+prices[i]-prices[i-1];
            }

        }
        return profit;
        
        
    }


}
