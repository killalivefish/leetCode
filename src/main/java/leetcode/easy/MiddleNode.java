package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        List<ListNode> temp = new ArrayList<>();
        ListNode copy = head;
        while (copy != null) {
            temp.add(copy);
            copy = copy.next;
        }
        return temp.get(temp.size() / 2);
    }

}
