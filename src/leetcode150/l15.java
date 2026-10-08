package leetcode150;

import java.util.Scanner;

public class l15 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of ratings array: ");
		int n=scan.nextInt();
		int[] ratings=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the rating for child : "+(i+1));
			ratings[i]=scan.nextInt();
		}
		
		int result=candies(ratings);
		System.out.println("Minimum candies that can be given is : "+result);
	}
	
	public static int candies(int[] ratings) {
		int[] candies=new int[ratings.length];
		
		
		for(int i=0;i<candies.length;i++) {
			candies[i]=1;
		}
		for(int i=1;i<ratings.length;i++) {
			if(ratings[i]>ratings[i-1]) {
				candies[i]=candies[i]+1;
			}
		}
		
		for(int i=ratings.length-2;i>=0;i--) {
			if(ratings[i]>ratings[i+1]) {
				candies[i]=Math.max(candies[i], candies[i+1]+1);
			}
		}
		
		int totalcand=0;
		
		
		for(int j=0;j<ratings.length;j++) {
			totalcand=totalcand+candies[j];
		}
		
		
		return totalcand;
	}

}
