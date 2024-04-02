package leetcode.honer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//20.ACM编程题 【40分】 标题：字符串排序 | 时间限制：1秒 | 内存限制：32768K
//        给定 n 个字符串，请对 n 个字符串按照字典序排列。
//        数据范围：1<=n<=1000  字符串长度满足 1<=len<=100

public class Twt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String[] strArray = new String[a];
        for (int i = 0; i < a; i++) {
            strArray[i] = in.nextLine();
        }
        Arrays.sort(strArray);
    
        for (String s : strArray) {
            System.out.println(s);
        }
    }
}
