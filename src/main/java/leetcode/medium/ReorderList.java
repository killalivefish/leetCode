package leetcode.medium;


import java.util.Stack;

public class ReorderList {
    public void reorderList(ListNode head) {
        Stack<ListNode> headStack = new Stack<>();
        Stack<ListNode> finalStack = new Stack<>();
        nodeToStack(head, headStack, finalStack);

        while ((!headStack.isEmpty() && !finalStack.isEmpty()) &&(headStack.peek().next != finalStack.peek().next)) {
            ListNode headPop = headStack.pop();
            ListNode fianlpop = finalStack.pop();
            headPop.next = fianlpop.next;
            fianlpop.next = headPop;
            if(fianlpop == fianlpop.next){
                fianlpop.next = null;
            }
        }
        findMidNode(head);
    }

    private void nodeToStack(ListNode head, Stack<ListNode> headStack, Stack<ListNode> fianlStack) {
        if (head != null) {
            headStack.push(head);
            nodeToStack(head.next, headStack, fianlStack);
            fianlStack.push(head);
        }
    }

    // 返回链表的中间节点
    private void findMidNode(ListNode head) {
        if(head != head.next){
            findMidNode(head.next);
        }else{
            head.next = null;
        }
    }

    public static class ListNode {
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

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//         1 2 3 4
//         4 3 2 1
        ReorderList reorderList = new ReorderList();
        reorderList.reorderList(a);
    }
}
