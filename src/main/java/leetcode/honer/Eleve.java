package leetcode.honer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//11.ACM编程题 【40分】 标题：求最小公倍数 | 时间限制：1秒 | 内存限制：32768K
//        正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。

public class Eleve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        char[] array = a.toCharArray();
        int aimInt = array.length/2;
        Map<Character,Integer> map = new HashMap<>();
        for (char c : array) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character, Integer> curEntry : map.entrySet()) {
            if(curEntry.getValue() >= aimInt){
                System.out.println(curEntry.getKey());
                break;
            }
        }
    }
}
