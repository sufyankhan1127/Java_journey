package Day01;

import java.util.Scanner;

//convert int into string and length of number
public class p15 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		int n=scan.nextInt();
		countLength(n);
		
	}
	
	public static void countLength(int n) {
		String s="";
		while(n>0) {
			int digit=(int)(n%10);
			s=digit+s;
			n=n/10;
		}
		System.out.print(s);
	}

}
