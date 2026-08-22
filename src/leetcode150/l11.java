package leetcode150;

import java.util.Scanner;

public class l11 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int [] citations=takeinput(scan);
		
		System.out.println("Researchers H_Index is : "+hIndex(citations));
	}
	
	public static int[] takeinput(Scanner scan) {
		System.out.println("Enter the length of array");
		int n=scan.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element"+(i+1));
			ar[i]=scan.nextInt();
		}
		
		return ar;
	}

	public static int hIndex(int[] citations) {

		for(int i=0;i<citations.length;i++){
			for(int j=0;j<citations.length-1-i;j++){
				if(citations[j]>citations[j+1]){
					int temp=citations[j];
					citations[j]=citations[j+1];
					citations[j+1]=temp;
				}
			}
		}

//		int res=0;
//
//		if((citations.length%2)!=0){
//			res=citations[(citations.length/2)];
//
//		}
//		else if(citations.length<2){
//			return citations[0];
//		}
//
//		else{
//			res=citations[(citations.length/2)-1];
//
//		}
//
//
//		return res;
		
		
		int res = 0;

        for (int i = citations.length - 1; i >= 0; i--) {

            int papers = citations.length - i;

            if (citations[i] >= papers) {
                res = papers;
            } else {
             break;
            }
        }

        return res;
        

	}


}

