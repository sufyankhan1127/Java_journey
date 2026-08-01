package Day01;

import java.util.Scanner;
import java.util.Arrays;

public class p17 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int M=scan.nextInt();
		int[] obligation=new int[M];
		for(int i=0;i<M;i++) {
			obligation[i]=scan.nextInt();
		}
		int maxgap=0;

        if (M == 0) {
            System.out.println(N);
            return;
        }

        Arrays.sort(obligation);
        maxgap=obligation[0]-1; // days before first obligation
        for(int i=0;i<M-1;i++){
            int gap=obligation[i+1]-obligation[i]-1;

            if(gap>maxgap){
                maxgap=gap;
            }
        }
        int lastgap=N-obligation[M-1];
        if(lastgap>maxgap){
            maxgap=lastgap;
        }
        

        System.out.println(maxgap);
	}

	        

}