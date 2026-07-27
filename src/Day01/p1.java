
//abcdRcyt@&^*2563
//valid password

//Abc124
//Invalid Password


package Day01;

import java.util.Scanner;

public class p1 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		passCheck(s);
		
		
	}
	
	
	public static void passCheck(String s) {
		int Lch=0, Uch=0,sc=0, no=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') {
				Uch++;
			}
			else if(ch>='a' && ch<='z'){
				Lch++;
			}
			else if(ch>='0' && ch<='9') {
				no++;
			}
			else {
				sc++;
			}
		}
		if(Lch>0 && Uch>0 && sc>0 && no>0) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}

	}

}
