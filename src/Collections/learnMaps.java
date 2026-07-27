package Collections;
import java.util.*;

public class learnMaps {
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		m.put(11, "Sufyan");
		m.put(25, "sohail");
		m.put(39, "arfat");
		m.putIfAbsent(1, "sfgf");
		
//		m.remove(1);
		
		
		System.out.println(m);
		System.out.println(m.containsKey(2));
		System.out.println(m.get(2));
		System.out.println(m.getOrDefault(7,"Others"));
		
		m.replace(11,"Sufyan","asnan");
		System.out.println(m);
		System.out.println(m.keySet());
		
		ArrayList<Integer> keys=new ArrayList<>(m.keySet());
		
		System.out.println(keys);
		

	}

}
