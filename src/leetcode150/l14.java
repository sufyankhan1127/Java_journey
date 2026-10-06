package leetcode150;

import java.util.Scanner;

public class l14 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=scan.nextLine();
		
		String res=longestSubstring(s);
		System.out.println(res);
	}
	
	public static String longestSubstring(String s) {
		String longest="";
		for(int i=0;i<s.length();i++) {
			String odd=expand(s, i, i);
			String even=expand(s,i,i+1);
			
			if(odd.length()>longest.length()) {
				longest=odd;
			}
			else if(even.length()>longest.length()){
				longest=even;
			}
		}
		
		return longest;
	}
	
	public static String expand(String s,int left,int right) {
		while(left>=0 && right <s.length() && s.charAt(left)==s.charAt(right)) {
			left--;
			right++;
		}
		
		return s.substring(left+1,right);
	}

}
