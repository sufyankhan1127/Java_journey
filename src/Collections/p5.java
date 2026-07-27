//input:1231324132
//output:
//[1, 2, 3, 1, 3, 2, 4, 1, 3, 2]

//1 : 3
//2 : 3
//3 : 3
//4 : 1



package Collections;
import java.util.*;

public class p5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String n=scan.nextLine();
		List<Character> no=new ArrayList<>();
		
		
		for(int i=0;i<n.length();i++) {
			
			no.add(n.charAt(i));
		}
		
		System.out.println(no);
		
		countFreqOfInt(no);
	}
		


	public static void countFreqOfInt(List<Character> no) {

	    Map<Character, Integer> freq = new HashMap<>();

	    for (char key : no) {
	        freq.put(key, freq.getOrDefault(key, 0) + 1);
	    }

	    for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
	        System.out.println(entry.getKey() + " : " + entry.getValue());
	    }
	}
}
