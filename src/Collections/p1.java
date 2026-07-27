//twosum problem



package Collections;
import java.util.*;

public class p1 {
	public static void main(String[] args) {
		List<Integer> ar=new ArrayList<>();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the lenth of the array");
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the "+i+"th element");
			ar.add(scan.nextInt());
		}
		
		System.out.println("Enter the k element");
		int target=scan.nextInt();
		
		Twosum(ar, target);
		
	}
	
	public static void Twosum(List<Integer> ar,int target) {
		Map<Integer,Integer> ts=new HashMap<>();
		for(int i=0;i<ar.size();i++) {
			int current=ar.get(i);
			int need=target-current;
			
			if(ts.containsKey(need)) {
				System.out.println(ts.get(need)+" , "+i);
				return;
			}
			
			ts.put(current,i);
		}
		
		System.out.println("NO key element found");
		
		
	}

}
