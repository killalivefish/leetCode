package leetcode.easy.tree;

//TODO
public class MinDepth {
    public int minDepth(TreeNode root) {
        int leftDep = 1;
        int rightDep = 1;
        if (root != null) {
            leftDep += minDepth(root.left);
            rightDep += minDepth(root.right);
        }

        return Math.min(leftDep, rightDep);
    }

}
