package leetcode.honer;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//17.ACM编程题 【40分】 标题：找出字符串中第一个只出现一次的字符 | 时间限制：1秒 | 内存限制：32768K
//        找出字符串中第一个只出现一次的字符

public class Seventeen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String a = in.nextLine();
    
        char[] strArray = a.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        
        for (Character str : strArray) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
    
        boolean has =false;
        for (Map.Entry<Character, Integer> curEntry : map.entrySet()) {
            if (curEntry.getValue() == 1) {
                System.out.println(curEntry.getKey());
                has=true;
                break;
            }
        }
        if(!has){
            System.out.println(-1);
        }
    }
}
