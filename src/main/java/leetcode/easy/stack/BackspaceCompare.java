package leetcode.easy.stack;

import java.util.Stack;

public class BackspaceCompare {
    public boolean backspaceCompare(String s, String t) {

        return addToStack(s).toString().equals(addToStack(t).toString());
    }

    private Stack<Character> addToStack(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('#' == c) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }

        return stack;
    }

    public static void main(String[] args) {
        BackspaceCompare back = new BackspaceCompare();
        System.out.println(back.backspaceCompare("ab#c", "ad#c"));
        System.out.println(back.backspaceCompare("ab##", "c#d#"));
        System.out.println(back.backspaceCompare("a##c", "#a#c"));
    }
}
