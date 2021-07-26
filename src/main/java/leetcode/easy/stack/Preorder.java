package leetcode.easy.stack;

import java.util.ArrayList;
import java.util.List;

public class Preorder {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        Node node = root;
        while(node != null){
            if(node.children!=null){
                for (Node child : node.children) {
//                    child.val;
//                    child.children;
                }
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
