package leetcode.medium;

import leetcode.easy.tree.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TODO
public class DistanceK {
    Map<TreeNode, TreeNode> nodeMap = new HashMap<>();
    List<Integer> result = new ArrayList<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        treeToMap(root, null);

        findK(target,null, 0, k, result);

        return result;
    }

    private void treeToMap(TreeNode root, TreeNode parentNode) {
        if (root != null) {
            nodeMap.put(root, parentNode);
            treeToMap(root.left, root);
            treeToMap(root.right, root);
        }
    }

    private void findK(TreeNode node,TreeNode target, int dep, int k, List<Integer> result) {
        if (node == null) {
            return;
        }
        if (dep == k) {
            result.add(node.val);
            return;
        }
        if(node.left!=node){
            findK(node.left,node, dep+1, k, result);
        }
        if(node.right!=node){
            findK(node.right,node, dep+1, k, result);
        }
        if(nodeMap.get(node)!=target){
            findK(nodeMap.get(node),node, dep+1, k, result);
        }
    }
}
