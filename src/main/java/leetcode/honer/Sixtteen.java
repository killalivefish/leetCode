package leetcode.honer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
//标题：将单向链表按某值划分为左边小，中间相等，右边大的形式 | 时间限制：2秒 | 内存限制：262144K
//给定一个链表，再给定一个整数 pivot，请将链表调整为左部分都是值小于 pivot 的节点，中间部分都是值等于 pivot 的节点， 右边部分都是大于 pivot 的节点。
//        除此之外，对调整后的节点顺序没有更多要求。

public class Sixtteen {
    
    
    static class ListNode {
        
        public int val;
        
        public ListNode next;
        
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
//    TODO
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String[] aimStr = in.nextLine().split(" ");
        int length = Integer.parseInt(aimStr[0]);
        int aim = Integer.parseInt(aimStr[1]);
        
        String[] arrays = in.nextLine().split(" ");
        ListNode orign = new ListNode(Integer.parseInt(arrays[0]));
        ListNode head = orign;
        for (int i = 1; i < length; i++) {
            head.next =  new ListNode(Integer.parseInt(arrays[i]));
            head = head.next;
        }
    
    
        ListNode small = new ListNode(-1);
        ListNode equal = new ListNode(-1);
        ListNode big = new ListNode(-1);
        while (orign!=null){
            int temp = orign.val;
            if(temp<aim){
            
            }else if(temp>aim){
            
            }else{
            
            }
            orign = orign.next;
        }
        
//        for (Integer cur : result) {
//            System.out.print(cur + " ");
//        }
    }
    
}
