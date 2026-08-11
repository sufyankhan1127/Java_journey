//merge two sorted arrays

package leetcode150;

import java.util.Arrays;
import java.util.Scanner;

public class l2 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int len1=scan.nextInt();
		int nums1[]=new int[len1];
		
		for(int i=0;i<len1;i++) {
			nums1[i]=scan.nextInt();
		}
		
		int len2=scan.nextInt();
		int nums2[]=new int[len1];
		
		for(int i=0;i<len2;i++) {
			nums2[i]=scan.nextInt();
		}
		
		int m=scan.nextInt();
		int n=scan.nextInt();
		
		merge(nums1,m,nums2,n);
		
	}


//	public static void merge(int[] nums1, int m, int[] nums2, int n) {
//
//		for(int i=0;i<n;i++){
//			nums1[m+i]=nums2[i];
//		}
//		Arrays.sort(nums1);
//		for(int l=0;l<nums1.length;l++){
//			System.out.print(nums1[l]+",");
//		}
//	}
	
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } 
            else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        // What happens if nums2 still has elements?
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }


}
