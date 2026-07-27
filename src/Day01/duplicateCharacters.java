package Day01;

import java.util.Scanner;

public class duplicateCharacters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		dupChar(s);
		
	}
	
	public static void dupChar(String s) {
		
		for(int i=0;i<s.length();i++) {
			boolean duplicate=false;
			for(int j=0;j<i;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					duplicate=true;
					break;
				}
			}
			
			if(duplicate) {
				System.out.print(s.charAt(i));
			}
		}
	}
	
	

}
