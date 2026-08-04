package Day01;
import java.util.*;

public class p29 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int start = scan.nextInt();

        printprimesfrom(num, start);
    }

    public static void printprimesfrom(int num, int start) {

        int j = start + 1;
        int count = 0;

        while (count < num) {

            if (isPrime(j)) {
                System.out.print(j + " ");
                count++;
            }

            j++;
        }
    }

    public static boolean isPrime(int no) {

        int count = 0;

        for (int i = 1; i <= no; i++) {

            if (no % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return true;
        }

        return false;
    }
}
