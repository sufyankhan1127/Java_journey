/*

80. Remove Duplicates from Sorted Array II
Medium
Topics
premium lock icon
Companies
Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

 

Example 1:

Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).*/

package leetcode150;

import java.util.Scanner;

public class l4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(removeDups2(scan));
	}
	
	public static int removeDups2(Scanner scan) {
		int n=scan.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the value "+(i+1));
			ar[i]=scan.nextInt();
		}
		
		int k=2;
		
		if(ar.length<=2) {
			return ar.length;
		}
		
		for(int i=2;i<ar.length;i++) {
			if(ar[i]!=ar[k-2]) {
				ar[k]=ar[i];
				k++;
			}
		}
		
		for(int i=0;i<k;i++) {
			System.out.print(ar[i]+" ");
		}
		
		System.out.println("Value of k");
		return k;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
