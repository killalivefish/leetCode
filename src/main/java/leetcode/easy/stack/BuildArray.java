package leetcode.easy.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BuildArray {
    final String push = "Push";
    final String pop = "Pop";

    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (index >= target.length) {
                break;
            }
            stack.push(i);
            result.add(push);
            if (target[index] != i) {
                stack.pop();
                result.add(pop);
            } else {
                ++index;
            }
        }

        return result;
    }
}
