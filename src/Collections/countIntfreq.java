//count int frequency
//1 2 1 2 2 
//1:2
//2:3




package Collections;
import java.util.*;

public class countIntfreq {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of integers");
		int n=scan.nextInt();
		
		
		List<Integer> ar=new ArrayList<>();
		for(int i=0;i<n;i++) {
			ar.add(scan.nextInt());
		}
		
		
		
		countFreqOfInt(ar);
	}
	
	public static void countFreqOfInt(List<Integer> ar) {
		
		Map<Integer,Integer> freq=new HashMap<>();
		for(int i=0;i<ar.size();i++) {
			int current=ar.get(i);

			if(freq.containsKey(current)) {
				freq.put(current, freq.get(current)+1);
			}
			
			else{
				freq.put(current, 1);
			}
			
		}
		
		for(Map.Entry<Integer,Integer> i:freq.entrySet()) {
			System.out.println(i.getKey()+" : "+i.getValue());
		}
	}
	

}
