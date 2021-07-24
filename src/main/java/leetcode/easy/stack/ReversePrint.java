package leetcode.easy.stack;

import java.util.Arrays;
import java.util.Stack;

public class ReversePrint {
    public int[] reversePrint(ListNode head) {
        if(head==null) {
            return  new int[]{};
        }
        Stack<Integer> stack = new Stack<>();
        do{
            stack.push(head.val);
            head = head.next;
        }
        while (head != null);

        int index = 0;
        int[] result = new int[stack.size()];
        while (!stack.isEmpty()){
            result[index] = stack.pop();
            ++index;
        }

        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;

        ReversePrint reversePrint = new ReversePrint();
        reversePrint.reversePrint(a);
    }
}
