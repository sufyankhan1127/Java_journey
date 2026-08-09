//check whether the given character is present in a string

package Day01;

import java.util.Scanner;

public class p35 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		char ch=scan.next().charAt(0);
		checPresence(s, ch);
	}
	
	public static void checPresence(String s,char ch) {
		boolean a=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				a=true;
				break;
			}
		}
		
		if(a==true) {
			System.out.println("Found");
		}
		
		else {
			System.out.println("Not found");
		}
	}

}
