package streamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		List <Integer> list=Arrays.asList(10,20,30,9,56,22,3,5,25);//This works
		/*ArrayList <Integer> list=Arrays.asArrayList(10,20,30,9,56,22,3,5,25);// This doesnt*/
		
		//IF we specifically want an arrayList we need to declare it like this
		ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(10,8,7,12,45,2,15,10));
		System.out.println("Enter the value to filter less than elements");
		int input=scan.nextInt();
		list.stream()
		.filter(n->n>input)
		.forEach(System.out::println);//why ::println but not .println what is the difference between both
		/*This is Java 8 method references meaning use println() method call whenever needed*/
		
//		. means:
//
//			Access/call something on an object.
		
		
		
//		:: means:
//
//			"Use this existing method as a function."
	}

}
