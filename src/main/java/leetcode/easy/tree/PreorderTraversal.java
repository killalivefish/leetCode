package leetcode.easy.tree;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        addChild(root,result);
        return result;
    }

    private void addChild(TreeNode node,List<Integer> result){
        result.add(node.val);
        if(node.left!=null){
            addChild(node.left,result);
        }
        if(node.right !=null){
            addChild(node.right,result);
        }
    }
}
