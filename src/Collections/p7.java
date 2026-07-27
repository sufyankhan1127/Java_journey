//Input:
//programming
//
//Output:
//3
//
//Duplicates are
//
//r
//g
//m




package Collections;
import java.util.*;

public class p7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		char[] letters=new char[s.length()];
		
		for(int i=0;i<letters.length;i++) {
			letters[i]=s.charAt(i);
		}
		
		
		printDupes(letters);
		
		
	}
	
	
	public static void printDupes(char[] letters ){
		
		Map<Character, Integer> cd=new HashMap<>();
		for(char ch:letters) {
			cd.put(ch,cd.getOrDefault(ch, 0)+1);
		}
		
		int count=0;
		System.out.println("Duplicate values are:");
		for(Map.Entry<Character, Integer> i:cd.entrySet()) {
			if(i.getValue()>1) {
				System.out.println(i.getKey());
				count++;
				
			}
			
		}
		
		System.out.println("Total no of dupes: "+count);
		
	}

}
