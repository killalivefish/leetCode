package leetcode.easy.stack;

import java.util.*;

//TODO
public class Preorder {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        LinkedList<Node> stack = new LinkedList();
        stack.push(root);
        if(!stack.isEmpty()){
            Node node = stack.pollLast();
            result.add(node.val);
            Collections.reverse(node.children);
            for (Node child : root.children) {
                stack.push(child);
            }
        }

        return result;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
