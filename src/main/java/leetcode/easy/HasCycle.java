package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        Map<ListNode,Integer> count = new HashMap<>();
        nodeToMap(head,count);
        for (Map.Entry<ListNode, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey().val+"--"+entry.getValue());
        }
        for (Integer value : count.values()) {
            if(value==2){
                return true;
            }
        }
        return false;
    }

    private void nodeToMap(ListNode node,Map<ListNode,Integer> count){
        if(node!=null){
            if(!count.containsKey(node)){
                count.put(node,0);
            }
            int curCout = count.get(node)+1;
            count.put(node,curCout);
            if(curCout>1){
                return;
            }
            nodeToMap(node.next,count);
        }
    }
}
