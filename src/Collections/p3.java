//count character frequency
//a:1
//b:2


package Collections;
import java.util.*;
public class p3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		List<Character> ch=new ArrayList<>();
		System.out.println("Enter the no of character You want:");
		int no=scan.nextInt();
		for(int i=0;i<no;i++) {
			ch.add(scan.next().charAt(0));
		}
		
		countcharFreq(ch);
		
	}
	
	public static void countcharFreq(List<Character> ch) {
		Map<Character,Integer> ccf=new HashMap<>();
		
		
		for(int i=0;i<ch.size();i++) {
			char current=ch.get(i);
			int count=1;
			if(ccf.containsKey(current)) {
				count=ccf.get(current)+count;
			}
			
			ccf.put(current,count);
		}
		
		System.out.println(ccf);
	}
}
