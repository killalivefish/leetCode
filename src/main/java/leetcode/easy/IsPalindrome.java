package leetcode.easy;

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        String str = x + "";
        int begin = 0;
        int end = str.length() - 1;
        for (; end > begin; begin++, end--) {
            if (str.charAt(begin) == str.charAt(end)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome(121));
        System.out.println(isPalindrome.isPalindrome(-121));
        System.out.println(isPalindrome.isPalindrome(11));
    }
}
