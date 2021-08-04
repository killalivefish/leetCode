package leetcode.easy.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
//        addChild(root,result);

        //method2
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode pop = stack.peek();
            result.add(pop.val);
            while(pop.left!=null){
                stack.push(pop.left);
                result.add(pop.left.val);
            }
            TreeNode pop1 = stack.pop();
            if(pop1.right!=null){
                result.add(pop1.right.val);
            }
        }

        return result;

        /*List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                res.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        return res;

        作者：LeetCode-Solution
        链接：https://leetcode-cn.com/problems/binary-tree-preorder-traversal/solution/er-cha-shu-de-qian-xu-bian-li-by-leetcode-solution/
        来源：力扣（LeetCode）
        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
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
