package leetcode.medium;

import leetcode.easy.tree.TreeNode;

import java.util.*;

public class KthLargestLevelSum {
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

    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Integer> sumList = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int sum = 0;
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode tempNode = queue.poll();
                sum+=tempNode.val;
                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    queue.add(tempNode.right);
                }
            }
            sumList.add(sum);
        }

        if(sumList.size()<k){
            return -1;
        }
        return sumList.get(k);
    }
}
