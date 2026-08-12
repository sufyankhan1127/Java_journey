//sort elements in an array using bubble sort 

package Day02;

import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int n=scan.nextInt();

		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		System.out.println("Ascending order");
		InsertionSort(ar);
//		System.out.println();
//		System.out.println("Descending order");
//		bubblesortDescending(ar);
	}

	public static void InsertionSort(int[] ar) {

	    for (int i = 1; i < ar.length; i++) {

	        int current = ar[i];
	        int j = i - 1;

	        // Shift larger elements to the right
	        while (j >= 0 && ar[j] > current) {
	            ar[j + 1] = ar[j];
	            j--;
	        }

	        // Put current element in its correct position
	        ar[j + 1] = current;
	    }
	    
	    for(int i=0;i<ar.length;i++) {
	    	System.out.print(ar[i]);
	    }
	
		
		
	}
}
