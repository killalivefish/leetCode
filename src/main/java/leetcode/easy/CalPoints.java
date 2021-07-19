package leetcode.easy;

import java.util.Stack;

public class CalPoints {
    public int calPoints(String[] ops) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            String curStr = ops[i];
            if ("+".equals(curStr)) {
                int temp = 0;
                if (!stack.isEmpty()) {
                    int curPeek = stack.pop();
                    temp += (curPeek + stack.peek());
                    stack.push(curPeek);
                    stack.push(temp);
                }
            } else if ("D".equals(curStr)) {
                stack.push(2 * stack.peek());
            } else if ("C".equals(curStr)) {
                stack.pop();
            } else {
                int cur = Integer.parseInt(curStr);
                stack.push(cur);
            }
        }

        for (Integer integer : stack) {
            result += integer;
        }
        return result;
    }
}
