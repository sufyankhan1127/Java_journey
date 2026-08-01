//count number of nodes in linkedlist

package Collections;

import java.util.Scanner;

public class p9 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Node1 head=new Node1(5);
		Node1 second=new Node1(15);
		Node1 third=new Node1(25);
		Node1 fourth=new Node1(35);
		Node1 fifth=new Node1(45);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		
		int n=scan.nextInt();
		Node1 temp=head;
//		int count=0;
		while(temp!=null) {
			if(temp.data==n) {
				System.out.println("Found");
				return;
			}
			temp=temp.next;
//			count++;
		}
		System.out.println("Not Found");
		
//		System.out.println(count);
	}

}

class Node1{
	int data;
	Node1 next;
	public Node1(int data) {
		this.data=data;// TODO Auto-generated constructor stub
	}
}
