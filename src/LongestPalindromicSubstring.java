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
