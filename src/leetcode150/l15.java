//135. Candy
//Solved
//Hard
//Topics
//premium lock icon
//Companies
//There are n children standing in a line.
//
//Each child is assigned a rating value given in the integer array ratings.
//
//You are giving candies to these children subjected to the following requirements:
//
//Each child must have at least one candy.
//Children with a higher rating get more candies than their neighbors.
//Return the minimum number of candies you need to have to distribute the candies to the children.
//
// 
//
//Example 1:
//
//Input: ratings = [1,0,2]
//Output: 5
//Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
//Example 2:
//
//Input: ratings = [1,2,2]
//Output: 4
//Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
//The third child gets 1 candy because it satisfies the above two conditions.
//

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
				candies[i]=candies[i-1]+1;
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
