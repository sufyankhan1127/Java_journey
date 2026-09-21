package streamsAPI;

import java.util.ArrayList;
import java.util.Scanner;

//multiply the element by 2 if it is odd ,multiply by 3 if even

public class p3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=scan.nextInt();
		ArrayList<Integer> list=new ArrayList();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element "+(i+1));
			list.add(scan.nextInt());
		}
		Solution(list);
	}
	
	public static void Solution(ArrayList<Integer> list) {
		list.stream().map(n->n%2!=0 ?n*2 :n*3).forEach(System.out::println);
	}
}
