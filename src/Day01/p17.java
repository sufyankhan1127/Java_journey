package Day01;

import java.util.Scanner;

public class p17 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] ar=printinput(scan);
		int M=scan.nextInt();
		
		int[] ar1=new int [M];
		int output=0;
		for(int i=0;i<M;i++) {
			ar1[i]=scan.nextInt();

		}
		
		for(int i=0;i<M;i++) {
			output=ar1[i+1]-ar1[i]-1;
			break;
		}
		
		System.out.println(output);
		
	}
	
	
	public static int[] printinput(Scanner scan) {
		int N=scan.nextInt();

		int[] ar=new int[N];
		
		for(int i=0;i<N;i++) {
			ar[i]=i+1;
		}
		
		
		
		return ar;
	}
	

}
