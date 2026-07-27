//countfrequency using hashmaps

//{apple:1,banana:2}


package Collections;
import java.util.*;

public class p2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String sentence=scan.nextLine();
		List<String> fruits=new ArrayList<>();
//		int noOffr=scan.nextInt();
//		for(int i=0;i<noOffr;i++) {
//			fruits.add(scan.next());
//		}
		
		String[] ar=sentence.split(" ");
		for(int i=0;i<ar.length;i++) {
			fruits.add(ar[i]);
			
		}
		
		countStrFreq(fruits);
	}
	
	
	public static void countStrFreq(List<String> fruits) {
		Map<String,Integer> countfreq=new TreeMap<>();

//		for(int i=0;i<fruits.size();i++) {
//			String current=fruits.get(i);
//			int count=1;
//			if(countfreq.containsKey(current)) {
//				countfreq.put(current, countfreq.get(current)+1);
//			}
//			else {
//				countfreq.put(current,1);
//			}
//		}
		
		for(String i:fruits) {
			countfreq.put(i, countfreq.getOrDefault(i, 0)+1);
		}
		
		for(Map.Entry<String,Integer> i:countfreq.entrySet()) {
			System.out.println(i.getKey()+" : "+i.getValue());
		}
	}

}
