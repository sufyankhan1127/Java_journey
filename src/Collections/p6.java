package Collections;
import java.util.*;
public class p6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String s=scan.nextLine();
		
		String[] words=s.split(" ");
		
		countwords(words);
	}
	
	
	public static void countwords(String[] words) {
		Map<String,Integer> cw=new LinkedHashMap<>();
		
		for(String i:words ) {

			cw.put(i,cw.getOrDefault(i, 0)+1);
		}
		
		for(Map.Entry<String, Integer>entry:cw.entrySet()) {
			System.out.println(entry.getKey()+" : " + entry.getValue());
		}
	}
}
