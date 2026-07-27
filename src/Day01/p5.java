//count characters in String
//aasman
//a:3, s:1, m:1 ,n:1



package Day01;
import java.util.Scanner;
public class p5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		charFreq(s);
		
	}
	
	public static void charFreq(String s) {
		int [] count=new int[256];
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i)]++;
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				System.out.println((char)(i)+" = " + count[i]);
			}
		}
	}

}
