//expand Compression
//a2b4c3
//aabbbbccc


package Day01;

import java.util.Scanner;

public class p14 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String s=scan.nextLine();
		expandCompStr(s);
	}
	
	public static void expandCompStr(String s) {
		for(int i=0;i<s.length();i+=2) {
			char ch=s.charAt(i);
			char no=s.charAt(i+1);//dont use int as it will covert it into ascii of 1 to 9
			int n=no-'0';
			for(int j=0;j<n;j++) {
				System.out.print(ch);
			}
		}
		
	}

}
