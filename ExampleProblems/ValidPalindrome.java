//Given two strings s and t, (assuming they only accept lower case letters) write a function to determine if t is a palindrome of s.

package ExampleProblems;

public class ValidPalindrome {
    public static void main(String[] args){
        String s = "racecar";
        String t = "racecar";

        System.out.println(isPalindrome(s,t));
    }

    public static boolean isPalindrome(String s, String t){
        char string[] = t.toCharArray();
        String rev = "";
        for(int i = string.length - 1; i >= 0; i--){
            rev += string[i];
        }
        if(s.equals(rev))
            return true;
        
        return false;

    }
}