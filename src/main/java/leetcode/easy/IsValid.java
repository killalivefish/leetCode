package leetcode.easy;

import java.util.Stack;

public class IsValid {
    public boolean isValid(String s) {
        int length = s.length();
        if (length < 2) {
            return false;
        }
        Stack<Character> charStack = new Stack<>();
        charStack.push(s.charAt(0));
        for (int i = 1; i < length; i++) {
            Character curChar = s.charAt(i);
            if(!charStack.isEmpty()){
                if (curChar == ')' && charStack.peek() == '(') {
                    charStack.pop();
                } else if (curChar == ']' && !charStack.isEmpty() && charStack.peek() == '[') {
                    charStack.pop();
                } else if (curChar == '}' && !charStack.isEmpty() && charStack.peek() == '{') {
                    charStack.pop();
                } else {
                    charStack.push(curChar);
                }
            }else{
                charStack.push(curChar);
            }

        }

        return charStack.isEmpty();
    }

    public static void main(String[] args) {
        IsValid isValid = new IsValid();
        System.out.println(isValid.isValid("(){}}{"));
        System.out.println(isValid.isValid("()"));
        System.out.println(isValid.isValid("[]"));
    }

}
