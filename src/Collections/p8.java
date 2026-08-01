


package Collections;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
public class p8 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Node head=new Node(5);
		Node second=new Node(15);
		Node third=new Node(25);
		Node fourth=new Node(35);
		head.next=second;
		second.next=third;
		third.next=fourth;
		
		Node temp=head;
		while(temp!=null) {
		
			System.out.println(temp.data);
			temp=temp.next;
		}

		
		
//		
//		System.out.println(head.data);
//		System.out.println(head.next.data);
//		System.out.println(head.next.next.data);
//		System.out.println(head.next.next.next.data);
//		
		}
}

class Node{
	int data;
	Node next;
	
	Node(int data) {
		this.data=data;
	}
}

