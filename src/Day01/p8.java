//remove dupicate words in a string
//programming
//out:progamin



package Day01;
import java.util.Scanner;

public class p8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        
        removeDupWords(str);

        
    }
    
    public static void removeDupWords(String s) {
    	
    	for(int i=0;i<s.length();i++) {
    		boolean duplicate=false;
    		for(int j=0;j<i;j++) {
    			if(s.charAt(i)==s.charAt(j)) {
    				duplicate=true;
    				break;
    			}
    		}
    		if(duplicate==false) {
    			System.out.print(s.charAt(i));
    		}
    	}
    	
    }
}