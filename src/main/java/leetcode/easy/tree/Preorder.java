package leetcode.easy.tree;

import java.util.*;

public class Preorder {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }
        getNodeVal(root, result);

        return result;
    }

    private void getNodeVal(Node node, List<Integer> result) {
        if (node.children != null && !node.children.isEmpty()) {
            for (Node child : node.children) {
                result.add(node.val);
                getNodeVal(child, result);
            }
        }
    }
}
