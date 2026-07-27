//remove duplicates and maintain the order
//input:abcdbcad
//out:abcd

package Day01;

import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		removeDuplicates(s);
		
	}
	
	public static void removeDuplicates(String s) {
		String result="";
		for(int i=0;i<s.length();i++) {
			boolean seen=true;
			for(int j=0;j<result.length();j++) {
				if(s.charAt(i)==result.charAt(j)) {
					seen=false;
					break;
				}
			}

			if(seen) {
				result=result+s.charAt(i);
			}
		}
		System.out.println(result);
	}

}
