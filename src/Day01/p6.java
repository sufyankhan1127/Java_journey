package Day01;
import java.util.Scanner;
public class p6 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String str=scan.nextLine();
		revStr(str);
	}
	
	public static void revStr(String s) {
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}

}
