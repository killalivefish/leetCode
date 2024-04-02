package leetcode.honer;

import leetcode.easy.tree.TreeNode;

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

//5.标题：判断t1树中是否有与t2树拓扑结构完全相同的子树 | 时间限制：3秒 | 内存限制：262144K
//        给定彼此独立的两棵二叉树，判断 t1 树是否有与 t2 树拓扑结构完全相同的子树。
//        设 t1 树的边集为 E1，t2 树的边集为 E2，若 E2 等于 E1 ，则表示 t1 树和t2 树的拓扑结构完全相同。
//https://www.nowcoder.com/practice/4eaccec5ee8f4fe8a4309463b807a542
public class Five {
    
    //    REMBER
    public static void main(String[] args) {
    
    }
    
    public boolean isContains(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 == null && root2 != null) {
            return false;
        } else if (root1 != null && root2 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            return isContains(root1.left, root2.left) && isContains(root1.right, root2.right);
        } else {
            return isContains(root1.left, root2) || isContains(root1.right, root2);
        }
    }
    
    
}