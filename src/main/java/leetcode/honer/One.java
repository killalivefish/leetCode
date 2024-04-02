package leetcode.honer;

//1. 标题：括号字符串的最长有效长度 | 时间限制：2秒 | 内存限制：262144K
//        给定一个括号字符串str，返回最长的能够完全正确匹配括号字符字串的长度。
//https://leetcode.cn/problems/longest-valid-parentheses/description/

import java.util.Scanner;
import java.util.Stack;

public class One {
//     REMBER
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLength =0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else {
                    maxLength = Math.max(maxLength,i-stack.peek());
                }
            }
        }
        
        
    }
}
