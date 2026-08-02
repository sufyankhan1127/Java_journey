package Day01;

import java.util.Scanner;

public class p20 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		printArmstrongbetween(x, y);
		
	}
	
	static void printArmstrongbetween(int x,int y) {
		
		for(int i=x+1;i<=y;i++) {
			int original=i;
			int count=0;
			int temp=i;
			
			while(temp>0) {
				count++;
				temp=temp/10;
			}
			
			temp=i;
			int sum=0;
			
			while(temp>0) {
				int digit=temp%10;
//				int power=1;
				/*for(int j=0;j<count;j++) {
					power=power*digit;
				}*/
				int power=(int) Math.pow(digit, count);
				
				sum=sum+power;
				temp=temp/10;
			}
			
			if(sum==original) {
				System.out.println(original);
			}
		}

	}


}
