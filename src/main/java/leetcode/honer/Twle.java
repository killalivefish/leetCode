package leetcode.honer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 *   public TreeNode(int val) {
 *     this.val = val;
 *   }
 * }
 */
//12.完善核心代码 语言限制 【40分】 标题：找到搜索二叉树中两个错误的节点 | 时间限制：2秒 | 内存限制：262144K
//        一棵二叉树原本是搜索二叉树，但是其中有两个节点调换了位置，使得这棵二叉树不再是搜索二叉树，请按升序输出这两个错误节点的值。(每个节点的值各不相同)
//        搜索二叉树：满足每个节点的左子节点小于当前节点，右子节点大于当前节点。

public class Twle {
    
    public static void main(String[] args) {
    
    }
    
    //    REMBER
    public int[] findError(TreeNode root) {
        // write code here
        // write code here
        int[] result = new int[2];
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        TreeNode x = null, y = null, pred = null;
        
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (pred != null && root.val < pred.val) {
                y = root;
                if (x == null) {
                    x = pred;
                } else {
                    break;
                }
            }
            pred = root;
            root = root.right;
        }
        result[0] = y.val;
        result[1] = x.val;
        return result;
        
    }
    
    private class TreeNode {
        
        int val = 0;
        
        TreeNode left = null;
        
        TreeNode right = null;
        
        public TreeNode(int val) {
            this.val = val;
        }
    }
}
