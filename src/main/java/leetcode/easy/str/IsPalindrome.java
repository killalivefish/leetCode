package leetcode.easy.str;


import java.util.Stack;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        s = sb.toString();
        for (int i = 0,j=s.length()-1; i < j; i++,j--) {

            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
