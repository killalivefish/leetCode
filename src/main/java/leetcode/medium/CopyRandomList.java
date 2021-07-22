package leetcode.medium;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CopyRandomList {
    public Node copyRandomList(Node head) {
        Map<Node, Node> tempMap = new LinkedHashMap<>();
        nodeToMap(head, tempMap);
        Node result = null;
        for (Map.Entry<Node, Node> nodeNodeEntry : tempMap.entrySet()) {
            Node value = nodeNodeEntry.getValue();
            if (result == null) {
                result = value;
            }
            Node key = nodeNodeEntry.getKey();
            value.next = tempMap.get(key.next);
            value.random = tempMap.get(key.random);
        }
        return result;
    }

    private void nodeToMap(Node node, Map<Node, Node> tempMap) {
        if (node != null) {
            tempMap.put(node, new Node(node.val));
            if (node.next != null) {
                nodeToMap(node.next, tempMap);
            }
        }
    }

    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(13);
        Node c = new Node(11);
        Node d = new Node(10);
        Node e = new Node(1);
        a.next = b;
        a.random = null;
        b.next = c;
        b.random = a;
        c.next = d;
        c.random = e;
        d.next = e;
        d.random = c;
        e.next = null;
        e.random = a;

        CopyRandomList copyRandomList = new CopyRandomList();
        copyRandomList.copyRandomList(a);
    }
}
