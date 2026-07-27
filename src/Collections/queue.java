package Collections;
import java.util.*;
public class queue {
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		
		
		System.out.println(q);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		System.out.println(q.poll());
	}

}
