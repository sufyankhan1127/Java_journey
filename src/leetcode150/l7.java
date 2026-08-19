//189 Rotate array



//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//
// 
//
//Example 1:
//
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
//Example 2:
//
//Input: nums = [-1,-100,3,99], k = 2
//Output: [3,99,-1,-100]
//Explanation: 
//rotate 1 steps to the right: [99,-1,-100,3]
//rotate 2 steps to the right: [3,99,-1,-100]

package leetcode150;

import java.util.Scanner;

public class l7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int [] result=rotateArray(scan);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		
	}
	
	public static int[] rotateArray(Scanner scan) {
		System.out.println("Enter the length of the array :");
		int n=scan.nextInt();
		int [] nums = new int [n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element " + (i+1));
			nums[i]=scan.nextInt();
		}
		System.out.println("Enter the k value:");
		int k=scan.nextInt();
		int [] ar = new int[nums.length];
		k=k%nums.length;
		int count=0;
		for(int i=nums.length-k;i<nums.length;i++) {
			ar[count]=nums[i];
			count++;
		}
		
		int index=k;
		for(int i=0;i<nums.length-k;i++) {
			ar[index]=nums[i];
			index++;
		}
		
		for(int j=0;j<nums.length;j++) {
			nums[j]=ar[j];
		}
		
		
		return nums;
	}
	
	

}
