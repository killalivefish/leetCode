package leetcode.honer;

import java.util.Scanner;

//23.ACM编程题 【40分】 标题：统计大写字母个数 | 时间限制：1秒 | 内存限制：32768K
//        找出给定字符串中大写字符(即'A'-'Z')的个数。

public class Twtthree {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int result = 0;
        for (char c : a.toCharArray()) {
            if(str.contains(c+"")){
                result++;
            }
        }
        System.out.println(result);
    }
}
