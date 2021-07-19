package leetcode.easy;

//TODO error
public class MaxDepth {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public int maxDepth(TreeNode root) {
        int dep = 1;
//        root.left;
//        root.right;
        return 0;
    }

    private int getDep(TreeNode node){
        if(node.left == null && node.right == null){
            return 0;
        }
        if(node.left != null){
            return 1+getDep(node.left);
        }
        if(node.right != null){
            return 1+getDep(node.right);
        }

        return 0;
    }
}
