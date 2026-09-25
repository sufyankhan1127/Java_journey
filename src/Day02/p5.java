package Day02;

import java.util.Scanner;

public class p5 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int value=scan.nextInt();
		
		
		System.out.println(removeElement(arr, value));
	}
	
	static int removeElement(int[] arr, int value) {
	    int j = 0;

	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] != value) {
	            arr[j] = arr[i];
	            j++;
	        }
	    }
	    System.out.println("Elements after removing: ");
	    for(int i=0;i<j;i++) {
	    	System.out.println(arr[i]);
	    }

	    System.out.println("The length is : ");
	    return j;//j returns the length after removing the value or the element
	}

}
