package leetcode.easy.linked;

public class MyLinkedList {

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int n) {
            val = n;
        }
    }

    ListNode head;
    int size;

    public MyLinkedList() {
        size=0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if (head == null) {
            return -1;
        }
        ListNode temp = head;
        for (int i = 0; i <= index; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    public void addAtHead(int val) {
        ListNode newHead = new ListNode(val);
        if (head != null) {
            newHead.next = head;
        }
        head = newHead;
        size++;
    }

    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
        }
        ListNode tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }

        ListNode newNode = new ListNode(val);
        newNode.next = null;
        tempNode.next = newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index != 0 && head == null) {
            return;
        }
        ListNode tempNode = head;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = tempNode.next;
        tempNode.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index<0 || index>size){
            return;
        }
        size--;
        if(index == 0){
            head = head.next;
        } else{
            ListNode tempNode = head;
            for (int i = 0; i < index - 2; i++) {
                tempNode = tempNode.next;
            }

            tempNode.next = tempNode.next.next;
        }
    }
}
