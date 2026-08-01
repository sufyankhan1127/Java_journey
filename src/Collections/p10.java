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
		int m=scan.nextInt();
		Node2 begin=new Node2(n);
		Node2 end=new Node2(m);
		
		begin.next=head;
		
		Node2 temp=begin;
		while(temp.next!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		
		temp.next=end;
		System.out.println(end.data);
	}

}

class Node2{
	int data;
	Node2 next;
	
	public Node2(int data) {
		this.data=data;
		
	}
}
