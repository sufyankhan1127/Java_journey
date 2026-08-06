package Day01;

import java.util.*;

public class p32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        inttoromans1(num);
    }

        
    public static void intToRomans(int num) 
    {
    	int[] values = {
                1000,900,500,400,
                100,90,50,40,
                10,9,5,4,1 };

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
    
    
    public static void inttoromans1(int num) {
    	String[] thousands = {
    		    "", "M", "MM", "MMM"
    		};

    		String[] hundreds = {
    		    "", "C", "CC", "CCC", "CD",
    		    "D", "DC", "DCC", "DCCC", "CM"
    		};

    		String[] tens = {
    		    "", "X", "XX", "XXX", "XL",
    		    "L", "LX", "LXX", "LXXX", "XC"
    		};

    		String[] ones = {
    		    "", "I", "II", "III", "IV",
    		    "V", "VI", "VII", "VIII", "IX"
    		};
    		
    		String ans =
    		        thousands[num / 1000] +
    		        hundreds[(num % 1000) / 100] +
    		        tens[(num % 100) / 10] +
    		        ones[num % 10];
    		
    		System.out.println(ans);
    }
    
}