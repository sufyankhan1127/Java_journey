package Day01;

import java.util.Scanner;

public class p21 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=scan.nextInt();
		Armstrongnumber(x);
		
	}
	
	public static void Armstrongnumber(int x) {
		
		int original=x;
		
		int count=0;
		int temp=x;
		//count digits first
		while(temp>0) {
			count++;
			temp=temp/10;
			
		}
		
		temp=x;
		int sum=0;
		while(temp!=0) {
			int digit=temp%10;
			int power=1;
			for(int i=0;i<count;i++) {
				power=power*digit;
			}
			sum=sum+power;
			
			temp=temp/10;
		}
		if(original==sum) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not Armstrong number");
		}
		
	}

}
