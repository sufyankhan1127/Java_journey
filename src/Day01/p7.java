//character compression
//aabbcc
//out:a1b2c3


package Day01;
import java.util.Scanner;
public class p7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		charComp(s);
	}
	
	public static void charComp(String s) {
		s=s.toLowerCase();
		int[] ar=new int[256];

		for(int i=0;i<s.length();i++) {
			ar[s.charAt(i)]++;
			
		}
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=0) {
				System.out.println((char)(i)+" : "+ar[i] );
			}
		}
	}

}
