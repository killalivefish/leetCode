package leetcode.easy.tree;

public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        StringBuilder sb1 = new StringBuilder();
        one(sb1, root.left);
        StringBuilder sb2 = new StringBuilder();
        one(sb2, root.right);

        return sb1.toString().equals(sb2.toString());
    }

    private void one(StringBuilder sb, TreeNode node) {
        if (node != null) {
            sb.append(node.val);
            if (node.left == null) {
                sb.append(" ");
            } else {
                sb.append(node.left.val);
            }
            if (node.right == null) {
                sb.append(" ");
            } else {
                sb.append(node.right.val);
            }
            one(sb, node.left);
            one(sb, node.right);
        }
    }

    private void two(StringBuilder sb, TreeNode node) {
        if (node != null) {

            sb.append(node.val);

            if (node.right == null) {
                sb.append(" ");
            } else {
                sb.append(node.right.val);
            }
            if (node.left == null) {
                sb.append(" ");
            } else {
                sb.append(node.left.val);
            }
            one(sb, node.right);
            one(sb, node.left);
        }
    }
}
