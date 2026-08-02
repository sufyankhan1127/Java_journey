package Day01;

import java.util.Scanner;
//use of method recursion
public class p18 {
	// Gcd of x and y using recursive function
    static int GCD(int x, int y)
    {
        // If one number becomes 0, the other number is the GCD
        if (x == 0)
           return y;
           
        if (y == 0)
            return x;

        // Both the numbers are equal
        if (x == y)
            return x;

        // x is greater
        if (x > y)
            return GCD(x - y, y);
        return GCD(x, y - x);
    }

    // The Driver method
    public static void main(String[] args)
    {
    	Scanner scan=new Scanner(System.in);
        int x = scan.nextInt(), y = scan.nextInt();
        System.out.println("GCD of " + x + " and " + y
                           + " is " + GCD(x, y));
    }

}



    
