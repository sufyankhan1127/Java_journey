
package Day01;
import java.util.Scanner;

public class pro03 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		checkPal(s);

	}

	public static void checkPal(String s) {
		String t="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			t=t+ch;
		}
		if(t.equals(s)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
