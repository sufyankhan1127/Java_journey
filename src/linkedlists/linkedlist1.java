package linkedlists;

public class linkedlist1 {
	
	static class Node{
		int data;
		Node next;
		
		Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public static void printlist(Node head){
		Node temp=head;
		
		while(temp!=null) {
			System.out.println(temp.data+",");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public static Node reverseLinked(Node head) {
		Node prev=null;
		Node current=head;
		
		while(current!=null) {
			Node next=current.next;
			current.next=prev;
			
			prev=current;
			current=next;
		}
		
		return prev;
	}
	
	public static void main(String[] args) {
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		
		System.out.println("Before reversing");
		printlist(head);
		
		head=reverseLinked(head);
		System.out.println("After reversing");
		printlist(head);
	}

}
