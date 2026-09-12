package DSA;

import java.util.Scanner;

public class dsa2 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		String s=scan.nextLine();
		boolean res=isPal(s);
		if(res) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
	
	public static boolean isPal(String s) {
		int st=0;
		int end=s.length()-1;
		
		while(st<end) {
			if(s.charAt(st)!=s.charAt(end)) {
				return false;
			}
			st++;
			end--;
			
		}
		return true;
	}

}
