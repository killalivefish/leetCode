package leetcode.easy.tree;

//TODO
public class FindSecondMinimumValue {
    public int findSecondMinimumValue(TreeNode root) {
        if(root.left == null && root.right == null){
            return -1;
        }else{
            if(root.left != null && root.right == null){
                return Math.max(root.val,root.left.val);
            }
            else if(root.right == null && root.left == null){
                return Math.max(root.val,root.right.val);
            }else {
                if(root.val == root.left.val && root.val == root.right.val){
                    return -1;
                }
                return Math.max(root.left.val,root.right.val);
            }
        }
    }
}
