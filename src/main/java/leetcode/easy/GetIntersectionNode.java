package leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<ListNode> nodeListA = new ArrayList<>();
        nodeToList(nodeListA, headA);
        List<ListNode> nodeListB = new ArrayList<>();
        nodeToList(nodeListB, headB);

        ListNode result = null;

        List<ListNode> same = new ArrayList<>();
        if (!nodeListA.isEmpty() && !nodeListB.isEmpty()) {
            int min = Math.min(nodeListA.size(),nodeListB.size());
            for (int i = 1; i <= min; i++) {
                if (nodeListA.get(nodeListA.size() - i).val == nodeListB.get(nodeListB.size()-i).val) {
                    same.add(nodeListA.get(nodeListA.size() - i));
                }else {
                    break;
                }
            }

        }

        if(!same.isEmpty()){
            result = same.get(same.size()-2);
        }
        return result;
    }

    private void nodeToList(List<ListNode> nodeList, ListNode nodeA) {
        if (nodeA != null) {
            nodeList.add(nodeA);
            nodeToList(nodeList, nodeA.next);
        }
    }
    /*
    private void nodeToMap(List<ListNode> nodeList, ListNode nodeA, ListNode nodeB) {
        if (nodeA != null && nodeB != null) {
            if (nodeA.val == nodeB.val) {
                nodeToMap(nodeList, nodeA.next, nodeB.next);
                nodeList.add(nodeA);
            }else{
                return;
            }
        }
    }*/
}
