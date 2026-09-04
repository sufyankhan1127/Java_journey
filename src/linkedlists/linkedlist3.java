package linkedlists;

import java.util.Scanner;

public class linkedlist3 {
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
		
		System.out.println("Enter the length of linked list:");
		int length=scan.nextInt();
		Node head=null;
		Node tail=null;
		for(int i=0;i<length;i++) {
			System.out.println("Enter the element on node :"+(i+1));
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
		
		System.out.println("Enter the value to find:");
		int findvalue=scan.nextInt();
		boolean found=false;
		Node temp=head;
		while(temp!=null) {
			if(temp.data==findvalue) {
				found=true;
				break;
			}
			
			temp=temp.next;
			
		}
		
		if(found) {
			System.out.println("Found the value");
		}
		else {
			System.out.println("Value not found");
		}
		
	}

}
