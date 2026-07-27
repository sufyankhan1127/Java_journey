//print non repeating characters
//input:programming
//output:poain


package Day01;

import java.util.Scanner;

public class p11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		prinNonrepeatedChar(s);
	}
	
	public static void prinNonrepeatedChar(String s) {

		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;

				}

			}
			if(count==1) {
				System.out.print(s.charAt(i));
			}
		}
	}

}
