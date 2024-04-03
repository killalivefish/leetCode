package leetcode.honer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
//标题：将单向链表按某值划分为左边小，中间相等，右边大的形式 | 时间限制：2秒 | 内存限制：262144K
//给定一个链表，再给定一个整数 pivot，请将链表调整为左部分都是值小于 pivot 的节点，中间部分都是值等于 pivot 的节点， 右边部分都是大于 pivot 的节点。
//        除此之外，对调整后的节点顺序没有更多要求。
//https://www.nowcoder.com/questionTerminal/04fcabc5d76e428c8100dbd855761778
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
    public static void main(String[] args) throws IOException {
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
        ListNode smallHead = small;
        ListNode equal = new ListNode(-1);
        ListNode equalHead = equal;
        ListNode big = new ListNode(-1);
        ListNode bigHead = big;
        while (orign != null) {
            int temp = orign.val;
            if (temp < aim) {
                small.next = new ListNode(temp);
                small = small.next;
            } else if (temp > aim) {
                big.next = new ListNode(temp);
                big = big.next;
            } else {
                equal.next = new ListNode(temp);
                equal = equal.next;
            }
            orign = orign.next;
        }
    
        // while (smallHead != null) {
        //     System.out.print(smallHead.val + " ");
        //     smallHead = smallHead.next;
        // }
        // System.out.print("=========== ");
        // while (equalHead != null) {
        //     System.out.print(equalHead.val + " ");
        //     equalHead = equalHead.next;
        // }
        // System.out.print("=========== ");
        // while (bigHead != null) {
        //     System.out.print(bigHead.val + " ");
        //     bigHead = bigHead.next;
        // }
        if (bigHead.next != null) {
            equal.next = bigHead.next;
            bigHead.next = null;
        }
        if (equalHead.next != null) {
            small.next = equalHead.next;
            equalHead.next = null;
        }
    
        smallHead = smallHead.next;
        while (smallHead != null) {
            System.out.print(smallHead.val + " ");
            smallHead = smallHead.next;
        }
    }
    
}
