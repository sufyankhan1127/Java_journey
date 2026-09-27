package leetcode150;

import java.util.Scanner;

public class l12 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		productexceptitself(ar);
	}

	public static int[] productexceptitself(int [] ar) {
		int[] answer=new int[ar.length];
		int leftprod=1;
		for(int i=0;i<ar.length;i++) {
			answer[i]=leftprod;
			leftprod=leftprod*answer[i];
		}
		
		int rightprod=1;
		for(int i=ar.length-1;i>=0;i--) {
			answer[i]=answer[i]*rightprod;
			rightprod=rightprod*answer[i];
			
		}
		
		return answer;
	}

}
