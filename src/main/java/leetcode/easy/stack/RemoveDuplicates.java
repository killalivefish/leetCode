package leetcode.easy.stack;

import java.util.Stack;

public class RemoveDuplicates {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (sb.length() == 0 || c != sb.charAt(sb.length() - 1)) {
                sb.append(c);
            } else {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveDuplicates remove = new RemoveDuplicates();
        System.out.println(remove.removeDuplicates("abbaca"));
        System.out.println(remove.removeDuplicates("azxxzy"));
        System.out.println(remove.removeDuplicates("aababaab"));
        System.out.println(remove.removeDuplicates("abbbabaaa"));
    }
}
