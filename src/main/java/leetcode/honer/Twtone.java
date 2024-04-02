package leetcode.honer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//21.【40分】 标题：微信红包 | 时间限制：3秒 | 内存限制：32768K
//        春节期间小明使用微信收到很多个红包，非常开心。在查看领取红包记录时发现，某个红包金额出现的次数超过了红包总数的一半。请帮小明找到该红包金额。写出具体算法思路和代码实现，要求算法尽可能高效。

public class Twtone {
    public static void main(String[] args) {
    }
    
    public static int cc(int[] nums,int length){
        Map<Integer,Integer> numMap = new HashMap<>();
        for (int num : nums) {
            numMap.put(num,numMap.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer, Integer> curEntry : numMap.entrySet()) {
            if(curEntry.getValue()>=length/2){
                return curEntry.getKey();
            }
        }
        return 0;
    }
}
