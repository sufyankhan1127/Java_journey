package Collections;

import java.util.Scanner;

public class p10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Node2 head=new Node2(5);
		Node2 second=new Node2(10);
		Node2 third=new Node2(15);
		Node2 fourth=new Node2(20);
		Node2 fifth=new Node2(25);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		
		int n=scan.nextInt();
		Node2 insert=new Node2(n);
		
		insert.next=head;
		
		Node2 newhead=insert;
		while(newhead!=null) {
//			head=n;
			System.out.println(newhead.data);
			newhead=newhead.next;
		}
		
	}

}

class Node2{
	int data;
	Node2 next;
	
	public Node2(int data) {
		this.data=data;
		
	}
}
