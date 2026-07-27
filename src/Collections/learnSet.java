package Collections;
import java.util.*;

public class learnSet {
	public static void main(String[] args) {
//		Set<Integer> set=new HashSet<>(); //O1
//		Set<Integer> set=new LinkedHashSet<>();   //On
		Set<Integer> set=new TreeSet<>(); //Ologn
		
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		
		set.remove(20);
		set.contains(10);
		
		System.out.println(set);
	}

}
