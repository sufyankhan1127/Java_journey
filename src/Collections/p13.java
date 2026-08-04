package Collections;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class p13 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Integer Value:");
		String s=scan.nextLine();
		IntToromans(s);
	}
	
	public static void IntToromans(String s) {
		Map<Integer,Character> romans=new HashMap<>();
		
		romans.put( 1,'I');
		romans.put(5,'V');
		romans.put(10,'X');
		romans.put(50,'L');
		romans.put(100,'C');
		romans.put(500,'D');
		romans.put(1000,'M');
		
		String sum="";
		for(int i=0;i<s.length();i++) {
			int num=s.charAt(i)-'0';
			
			Character current=romans.get(s.charAt(i));
			
			if(i<s.length()-1) {
				Character next=romans.get(s.charAt(i+1));
				if(current<next) {
					sum=
				}
				
			}
			else {
				sum=sum+current;
			}
		}
		
		
		System.out.println("The Roman value for this is : "+sum);
		
	}

}
