package leetcode.easy.tree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        add(root, result);

        return result;
    }

    private void add(TreeNode root, List<Integer> result) {
        if (root != null) {
            add(root.left, result);
            result.add(root.val);
            add(root.right, result);
        }
    }
}
