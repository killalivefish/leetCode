package leetcode.easy.tree;

import java.util.ArrayList;
import java.util.List;

//TODO use digu
public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> pList = new ArrayList<>();
        fortree(p, pList);
        List<Integer> qList = new ArrayList<>();
        fortree(q, qList);

        return pList.containsAll(qList);
    }

    private void fortree(TreeNode node, List<Integer> result) {
        if (node != null) {
            result.add(node.val);
            fortree(node.left, result);
            fortree(node.right, result);
        } else {
            result.add(null);
        }
    }
}
