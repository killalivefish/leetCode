package leetcode.easy.stack;

import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int cur = nums1[i];
            int n = -1;
            Stack<Integer> stack = new Stack<>();
            for (int i1 = 0; i1 < nums2.length; i1++) {
                if (nums2[i1] == cur) {
                    stack.push(-1);
                    continue;
                }
                if (!stack.isEmpty()) {
                    if (cur < nums2[i1]) {
                        stack.push(nums2[i1]);
                        break;
                    }
                }
            }

            result[i] = stack.peek();
        }

        return result;
    }
}
