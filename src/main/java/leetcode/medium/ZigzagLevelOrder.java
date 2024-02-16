package leetcode.medium;

import java.util.*;

//TODO 错误 队列的使用
public class ZigzagLevelOrder {

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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int index = 1;
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> curList = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                TreeNode tempNode = queue.poll();
                curList.add(tempNode.val);
                if (index % 2 == 0) {
                    if (tempNode.left != null) {
                        queue.add(tempNode.left);
                    }
                    if (tempNode.right != null) {
                        queue.add(tempNode.right);
                    }
                } else {
                    if (tempNode.right != null) {
                        queue.add(tempNode.right);
                    }
                    if (tempNode.left != null) {
                        queue.add(tempNode.left);
                    }
                }
            }
            result.add(curList);
            index++;
        }

        return result;
    }
}
