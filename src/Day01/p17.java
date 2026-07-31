package Day01;

import java.util.Scanner;

public class p17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Total number of days
        int N = scan.nextInt();

        // Number of obligation days
        int M = scan.nextInt();

        // Store obligation days
        int[] obligation = new int[M];

        for (int i = 0; i < M; i++) {
            obligation[i] = scan.nextInt();
        }

        int maxGap = 0;

        // 1. Days before the first obligation
        maxGap = obligation[0] - 1;

        // 2. Days between consecutive obligations
        for (int i = 0; i < M - 1; i++) {

            int gap = obligation[i + 1] - obligation[i] - 1;

            if (gap > maxGap) {
                maxGap = gap;
            }
        }

        // 3. Days after the last obligation
        int lastGap = N - obligation[M - 1];

        if (lastGap > maxGap) {
            maxGap = lastGap;
        }

        System.out.println(maxGap);

        scan.close();
    }
}