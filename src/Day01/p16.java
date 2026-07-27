//print factors:
//input:7
//output:5,040


package Day01;
import java.util.Scanner;

public class p16 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		long factorial=(printfact(n));
		
		printDesOut(factorial);
		
	}
	
	public static long printfact(int n) {
		
		while(n==0 || n==1) {
			return 1;
		}
		return n*printfact(n-1);
		
	}
	
	
	public static void printDesOut(long factorial) {
		String s="";
		int count=0;
		while(factorial>0) {
			s=(int)(factorial%10)+s;
			factorial=factorial/10;
			count++;
			
			if(count==3 && factorial>0) {
				s=","+s;
			}
		}
		
		System.out.print(s);
	}
}
