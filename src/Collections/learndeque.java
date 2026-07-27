package Collections;
import java.util.*;

public class learndeque {
	public static void main(String[] args) {
		
		ArrayDeque<Integer> dq=new ArrayDeque<>();
		
		dq.offer(20);
		dq.offer(30);
		dq.offerLast(60);
		dq.offer(40);
		dq.offer(220);
		dq.offerFirst(10);
		
		
		System.out.println(dq.poll());
		System.out.println(dq.pollLast());
		
		System.out.println(dq);
		
		System.out.println(dq.peek());
		
	}

}
