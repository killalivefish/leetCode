package leetcode.honer;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
//10.标题：括号字符串的有效性 | 时间限制：2秒 | 内存限制：262144K
//        给定一个字符串str，判断是不是整体有效的括号字符串(整体有效：即存在一种括号匹配方案，使每个括号字符均能找到对应的反向括号，且字符串中不包含非括号字符)。
//https://www.nowcoder.com/practice/769abd985f3849d0b9415b082f94c192
public class Ten {
    public static void main(String[] args) {
        String b = "(())()(()";
        char[] array = b.toCharArray();
        for (char c : array) {
            System.out.print(c+" ");
        }
        System.out.println();
        System.out.println(cc(array));
    }
    
    public static String cc(char[] array){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            if('('==array[i]){
                stack.push(array[i]);
                System.out.println("push "+array[i]);
            }
            else if(')'==array[i] && stack.peek()=='('){
                stack.pop();
                System.out.println("pop "+array[i]);
            }else {
                return "No";
            }
        }
      
        return stack.isEmpty()?"Yes":"No";
    }
}
