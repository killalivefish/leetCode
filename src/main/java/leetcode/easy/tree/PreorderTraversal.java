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
        result.add(node.getVal());
        if(node.getLeft()!=null){
            addChild(node.getLeft(),result);
        }
        if(node.getRight() !=null){
            addChild(node.getRight(),result);
        }
    }
}
