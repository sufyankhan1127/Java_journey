package Day01;
import java.util.Scanner;
public class p9 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		printOnlyDups(s);
	}
	
	
	public static void printOnlyDups(String s) {
		
		for(int i=0;i<s.length();i++) {
			boolean a=false;
			for(int j=0;j<i;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					a=true;
					System.out.print(s.charAt(j));
					break;
				}
			}
		}
	}

}
