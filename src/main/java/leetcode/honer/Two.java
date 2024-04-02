package leetcode.honer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//OK
//2.ACM编程题 【40分】 标题：在其它数出现次数都为偶数的数组中找到出现次数为奇数次的数 | 时间限制：2秒 | 内存限制：262144K
//        给一个数组arr，其中只有一个数出现了奇数次，其它数出现了偶数次，打印这个数。
//https://www.nowcoder.com/practice/d0ef3e33e63a49dd99c90aeef306b0fc
public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
    
        String[] strArray = b.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String curStr : strArray) {
            if (map.containsKey(curStr)) {
                map.put(curStr, map.get(curStr) + 1);
            } else {
                map.put(curStr, 1);
            }
        }
        // System.out.print(map.toString());
        for (Map.Entry<String, Integer> curEntry : map.entrySet()) {
            if (curEntry.getValue() % 2 == 1) {
                System.out.print(curEntry.getKey());
                break;
            }
        }
    }

}
