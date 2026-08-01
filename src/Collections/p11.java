package Collections;

import java.util.Scanner;

public class p11 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Node3 head=new Node3(10);
		Node3 second=new Node3(30);
		Node3 third=new Node3(20);
		Node3 fourth=new Node3(40);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		
		//Delete at first
		/*
		head=head.next;
		
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
		*/
		
		
		
		//Delete at last
		if (head == null || head.next == null) {
		    head = null;
		}
		
		else{
			Node3 temp=head;
			
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			
			temp.next=null;
			
			temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		
	}

}

class Node3{
	int data;
	Node3 next;
	public Node3(int data) {
		this.data=data;
	}
}
