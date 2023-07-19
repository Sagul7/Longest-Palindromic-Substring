import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(longestPalindromic(word));
    }
    public static String longestPalindromic(String s)
    {
        while(true)
        {
            if(ispalindrome(s))
            {
                return s;
            }
            else
            {
                s = s.substring(1);
            }
        }
    }
    public static boolean ispalindrome(String s)
    {
        int low = 0,high =s.length()-1;
        while(low<high)
        {
            if(s.charAt(low)!=s.charAt(high))
            {
                return false;
            }
            low++;high--;
        }
        return true;
    }
}
/*
Longest Palindromic Substring
Given a string A of size N, find and return the longest palindromic substring in A.

Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A

Example Input

Input 1:
A = "aaaabaaa"

Input 2:
A = "abba


Example Output

Output 1:
"aaabaaa"

Output 2:
"abba"
*

*/
