package leetcode.easy;

//TODO
public class TitleToNumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = columnTitle.length(); i > 0; i--) {
            int cur = columnTitle.charAt(i-1)-'A'+1;

            result+=26*(columnTitle.length()-i)*cur+cur;
        }
        return result;
    }

    public static void main(String[] args) {
        TitleToNumber titleToNumber = new TitleToNumber();
        System.out.println(titleToNumber.titleToNumber("A"));
        System.out.println(titleToNumber.titleToNumber("AB"));
        System.out.println(titleToNumber.titleToNumber("ZY"));
        System.out.println(titleToNumber.titleToNumber("FXSHRXW"));
    }
}
