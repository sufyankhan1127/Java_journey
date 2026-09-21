package streamsAPI;

import java.util.ArrayList;
import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=scan.nextInt();
		ArrayList<Integer> list=new ArrayList();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element "+(i+1));
			list.add(scan.nextInt());
		}
		filterstream(list, scan);
		
	}
	
	public static void filterstream(ArrayList<Integer> list,Scanner scan) {
		System.out.println("Enter the operation for filtering");
		System.out.println("1.Find Greater than elements from input");
		System.out.println("2.Find Less than elements from input");
		int input=scan.nextInt();
		System.out.println("Enter the value for operation");
		//ternary operator cannot be used with forEach so if else 
		if(input==1) {
			int value=scan.nextInt();
			list.stream().
			filter(n->n>value)
			.forEach(System.out::println);
		}
		else if(input==2) {
			int value=scan.nextInt();
			list.stream().
			filter(n->n<value)
			.forEach(System.out::println);
		}
		else {
			System.out.println("Enter valid option");
		}

	}

}
