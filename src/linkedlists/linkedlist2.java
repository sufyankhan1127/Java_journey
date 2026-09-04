package linkedlists;

import java.util.Scanner;

public class linkedlist2 {
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Linked list");
		int n=scan.nextInt();
		Node head=null;
		Node tail=null;
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter the value for Node "+(i+1));
			int value=scan.nextInt();
			
			Node newnode=new Node(value);
			
			if(head==null) {
				head=newnode;
				tail=newnode;
			}
			else {
				tail.next=newnode;
				tail=newnode;
			}
		}
		Node temp = head;

	    while (temp != null) {
	        System.out.print(temp.data + " ");
	        temp = temp.next;
	    }
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			
		}
		System.out.println("\nMiddle Value "+slow.data);
	}

}
