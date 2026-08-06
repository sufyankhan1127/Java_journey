package Day01;

import java.util.*;

public class p32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] values = {
                1000,900,500,400,
                100,90,50,40,
                10,9,5,4,1
        };

        String[] romans = {
                "M","CM","D","CD",
                "C","XC","L","XL",
                "X","IX","V","IV","I"
        };

        StringBuilder ans = new StringBuilder();

        for(int i=0;i<values.length;i++){

            while(num >= values[i]){
                ans.append(romans[i]);
                num -= values[i];
            }

        }

        System.out.println(ans);
    }
}