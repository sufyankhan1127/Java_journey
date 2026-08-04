package Collections;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class companyp5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Roman Value:");
		String s=scan.nextLine();
		romantoInt(s);
	}
	
	public static void romantoInt(String s) {
		Map<Character,Integer> romans=new HashMap<>();
		
		romans.put('I', 1);
		romans.put('V', 5);
		romans.put('X', 10);
		romans.put('L', 50);
		romans.put('C', 100);
		romans.put('D', 500);
		romans.put('M', 1000);
		
		int sum=0;
		for(int i=0;i<s.length();i++) {
			
			int current=romans.get(s.charAt(i));
			if(i<s.length()-1) {
				int next=romans.get(s.charAt(i+1));
				if(current<next){
					sum=sum-current;
				}
				else {
					sum=sum+current;
				}
			}
			else {
				sum=sum+current;
			}
			
			
		}
		
		System.out.println("The integer value for this is : "+sum);
		
	}

}
