package Collections;
import java.util.*;

public class LearnQueue {
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);
		q.offer(60);
		
		while(!q.isEmpty()) {
			System.out.print(q);
		}
	}

}
