package Collections;
import java.util.*;

public class listIterator {
	public static void main(String[] args) {
		List <String> fruits=new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Chickoo");
		fruits.add("Pineapple");
		fruits.add("Mango");
		
		System.out.println(fruits);
		
		
		for(int i=0;i<fruits.size();i++) {
			System.out.println("Fruit is "+i);
		}
		
		for(Object fruit:fruits) {
			System.out.println("Fruit is BY FOR EACH: "+fruit);
			
		}
		
		Iterator<String> fe=fruits.iterator();//Collections method
		while(fe.hasNext()) {
			System.out.println("Iterator: "+fe.next());
		}
		
		//give sublist from list using indexes from and to
		List<String> smalllist=fruits.subList(1, 4);
		System.out.println(smalllist);
		
	}

}
