/*Problem
Given a string, find and print the longest substring without repeating characters. 
If there are multiple substrings with the same length, print the first one.

Input Format
A single line containing the string `s`.

Output Format
Print the longest substring without repeating characters.

Sample Inputs & Outputs
Sample Input 1

abcdaef


Sample Output 1

bcdaef

*/

package Day01;

import java.util.Scanner;

public class companyp1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        printlongestSubstring(s);
    }

    public static void printlongestSubstring(String s) {
        int maxLen = 0;          // length of longest substring found
        int startIndex = 0;      // starting index of longest substring

        // Outer loop: starting point of substring
        for (int i = 0; i < s.length(); i++) {
            boolean[] visited = new boolean[256]; // track characters seen
            int currentLen = 0;

            // Inner loop: expand substring from i
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);

                // If character already seen, stop expanding
                if (visited[c]) {
                    break;
                } else {
                    visited[c] = true;
                    currentLen++;
                }

                // Update longest substring if current one is longer
                if (currentLen > maxLen) {
                    maxLen = currentLen;
                    startIndex = i;
                }
            }
        }

        // Print the longest substring
        for (int k = startIndex; k < startIndex + maxLen; k++) {
            System.out.print(s.charAt(k));
        }
    }
}
