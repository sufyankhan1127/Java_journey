package Day01;

import java.util.HashMap;
import java.util.Scanner;

public class p31 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		romantoint1(s);
		
	}
	
	public static void romantoint(String s) {
		HashMap<Character,Integer> map=new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int sum=0;
		for(int i=0;i<s.length();i++) {
			int current=map.get(s.charAt(i));
			
			if(i==s.length()-1) {
				sum=sum+current;
			}else {
				
				int next=map.get(s.charAt(i+1));
				
				if(current<next) {
					sum=sum-current;
					
				}
				else {
					sum=sum+current;
				}
			}
		}
//		sum=sum+map.get(s.charAt(s.length()-1));
		
		System.out.println(sum);
	}
	
	public static int getValue(char ch) {
		switch (ch) {
		case 'I': 
			return 1;
		case 'V':
			return 5;
		case 'L':
			return 50;
		case 'X':
			return 10;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}
	
	public static void romantoint1(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++) {
			int current=getValue(s.charAt(i));
			
			if(i==s.length()-1) {
				sum=sum+current;
			}
			else {
				int next=getValue(s.charAt(i+1));
				if(current<next) {
					sum=sum-current;
				}
				else {
					sum=sum+current;
				}
			}
		}
		System.out.println(sum);
	}

}
