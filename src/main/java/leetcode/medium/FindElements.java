package leetcode.medium;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class FindElements {
    private Set<Integer> mySet =new HashSet<>();

    public FindElements(TreeNode root) {
        root.val = 0;
        mySet.add(root.val );
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode tempNode = queue.poll();
            if (tempNode.left != null) {
                tempNode.left.val = tempNode.val * 2 + 1;
                mySet.add(tempNode.left.val);
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                tempNode.right.val = tempNode.val * 2 + 2;
                mySet.add(tempNode.right.val);
                queue.add(tempNode.right);
            }
        }
    }

    public boolean find(int target) {
        return mySet.contains(target);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
