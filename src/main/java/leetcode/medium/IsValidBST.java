package leetcode.medium;

import leetcode.easy.tree.TreeNode;

import java.util.Stack;

public class IsValidBST {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            for (int i = 0; i < stack.size(); i++) {
                TreeNode temp = stack.pop();
                if (temp.left != null && temp.val <= temp.left.val) {
                    return false;
                }
                if (temp.right != null && temp.val >= temp.right.val) {
                    return false;
                }
                if (temp.left != null) {
                    stack.push(temp.left);
                }
                if (temp.right != null) {
                    stack.push(temp.right);
                }
            }
        }
        return true;
    }
}
