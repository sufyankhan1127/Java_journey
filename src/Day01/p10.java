
package Day01;
import java.util.Scanner;

public class p10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		countRepeatedChar(s);
	}
	
	public static void countRepeatedChar(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
//			boolean a=false;
			for(int j=0;j<i;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
				
			}
		}
		System.out.println(count);
	}

}
