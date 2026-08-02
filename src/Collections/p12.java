package Collections;

import java.util.Scanner;

public class p12 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		Node4 head=new Node4(2);
		Node4 second=new Node4(4);
		Node4 third=new Node4(6);
		Node4 fourth=new Node4(8);
		Node4 fifth=new Node4(10);
		Node4 sixth=new Node4(12);
		Node4 seventh=new Node4(14);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		sixth.next=seventh;
		System.out.print("Enter position: ");
        int position = scan.nextInt();

        System.out.print("Enter value: ");
        int value = scan.nextInt();

        Node4 insertion = new Node4(value);

        Node4 temp = head;
        int count = 1;
        /*for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        insertion.next = temp.next;
        temp.next = insertion;

        temp = head;
        */

		
		 while (temp != null) {

	            if (count == position - 1) {
	                insertion.next = temp.next;
	                temp.next = insertion;
	                break;
	            }

	            temp = temp.next;
	            count++;
	        }

	        temp = head;

	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
//		temp=head;
//		while(temp!=null) {
//			temp=temp.next;
//			System.out.println(temp.data);
//		}
//		System.out.println(count);
		
		
		
	}

}

class Node4{
	int data;
	Node4 next;
	public Node4(int data) {
		this.data=data;
	}
}
