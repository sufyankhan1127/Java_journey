package Day01;
import java.util.*;

class p30 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int[] ar1 = new int[n1];
        int[] ar2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            ar1[i] = scanner.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            ar2[i] = scanner.nextInt();
        }

        mergeArrays(ar1, ar2);
    }

    public static void mergeArrays(int[] ar1, int[] ar2) {

        int i = 0;
        int j = 0;

        while (i < ar1.length && j < ar2.length) {

            if (ar1[i] <= ar2[j]) {
                System.out.print(ar1[i] + " ");
                i++;
            } else {
                System.out.print(ar2[j] + " ");
                j++;
            }
        }

        // Print remaining elements of first array
        while (i < ar1.length) {
            System.out.print(ar1[i] + " ");
            i++;
        }

        // Print remaining elements of second array
        while (j < ar2.length) {
            System.out.print(ar2[j] + " ");
            j++;
        }
    }
}