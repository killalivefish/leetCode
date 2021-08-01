package leetcode.medium;


import java.util.Stack;

//TODO
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> stack1 = new Stack<>();
        listNodePushStack(l1,stack1);
        Stack<ListNode> stack2 = new Stack<>();
        listNodePushStack(l2,stack2);



        return null;
    }


    private void listNodePushStack(ListNode listNode, Stack<ListNode> stack) {
        if (listNode != null) {
            stack.push(listNode);
            listNodePushStack(listNode.next, stack);
        }
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
