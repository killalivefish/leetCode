package leetcode.easy.stack;

import leetcode.medium.ReorderList;

import java.util.Stack;

public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> headStack = new Stack<>();
        Stack<ListNode> finalStack = new Stack<>();
        nodeToStack(head, headStack, finalStack);
        while (!headStack.isEmpty()){
            if(headStack.pop().val !=finalStack.pop().val){
                return false;
            }
        }

        return true;
    }

    private void nodeToStack(ListNode head, Stack<ListNode> headStack, Stack<ListNode> fianlStack) {
        if (head != null) {
            headStack.push(head);
            nodeToStack(head.next, headStack, fianlStack);
            fianlStack.push(head);
        }
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
