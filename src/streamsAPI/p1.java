package streamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		List <Integer> list=Arrays.asList(10,20,30,9,56,22,3,5,25);
		System.out.println("Enter the value to filter less than elements");
		int input=scan.nextInt();
		list.stream().filter(n->n>input).forEach(System.out::println);
	}

}
