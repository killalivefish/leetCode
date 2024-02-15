package leetcode.medium;

import java.util.*;

public class LevelOrderBottom {
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

    public List<List<Integer>> solution(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> curList = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                TreeNode tempNode = queue.poll();
                curList.add(tempNode.val);
                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    queue.add(tempNode.right);
                }
            }
            result.add(curList);
        }

        Collections.reverse(result);
        return result;
    }


    public static void main(String[] args) {
//        TreeNode root = new TreeNode()
    }
}
