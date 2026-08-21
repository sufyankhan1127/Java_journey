package leetcode150;

import java.util.Scanner;

public class l10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		
		boolean res=Jumpgame(ar);
		
		System.out.println(res);
	}
	
	public static boolean Jumpgame(int[] ar) {
		int maxreach=0;
		for(int i=0;i<ar.length;i++) {
			if(i>maxreach) {
				return false;
			}
			
			maxreach=Math.max(maxreach, i+ar[i]);
			
			if(maxreach>=ar.length-1) {
				return true;
			}
		}
		
		return true;
		
	}

}
