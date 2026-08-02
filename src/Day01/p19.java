package Day01;

import java.util.Scanner;

public class p19 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		Leapyear(x);
	}
	
	public static void Leapyear(int x) {
		
		boolean isleapyear=false;
		
		if(x%4==0) {
			isleapyear=true;
			if(x%100==0) {
				if(x%400==0) {
					isleapyear=true;
				}
				else {
					isleapyear=false;
				}
			}
			
		}
		else {
			isleapyear=false;
		}
		
		if(isleapyear) {
			System.out.println(x +": is a leap year");
		}
		else {
			System.out.println(x +": is not a leap year");
		}
		
	}
	

}
