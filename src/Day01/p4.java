//check whether anagram
//asim
//misa


//output:Anagram



package Day01;
import java.util.*;

public class p4 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the first String:");
		String s1=scan.nextLine();
		System.out.println("Enter the second String:");
		String s2=scan.nextLine();
		
		if(isAnagram(s1,s2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}
	
	public static boolean isAnagram(String s1,String s2) {
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();

		
		if(s1.length()!=s2.length()) {
			return false;
		}

		int[] count=new int[256];
		
		for(int i=0;i<s1.length();i++) {
			count[s1.charAt(i)]++;
		}
		
		
		
		for(int i=0;i<s2.length();i++) {
			count[s2.charAt(i)]--;
		}
		
		
		
		for(int i=0;i<256;i++) {
			if(count[i]!=0) {
				return false;
			}
		}

		return true;
		
	}
	

}
