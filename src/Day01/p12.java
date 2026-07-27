//find the length of string without using length()


package Day01;
import java.util.Scanner;

public class p12 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String s=scan.nextLine();
		findLength(s);
	}
	
	public static void findLength(String s) {
		int count=0;
		try {
			while(true) {
				s.charAt(count);
				count++;
			}
			
		} 
		catch (StringIndexOutOfBoundsException e) {
		}
		
		System.out.println(count);
		
		System.out.println(s.length());
		
	}
	

}
