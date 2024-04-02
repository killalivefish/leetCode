package leetcode.honer;

import java.time.temporal.ChronoField;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

//25.ACM编程题 【40分】 标题：数组中值出现了一次的数字 | 时间限制：2秒 | 内存限制：262144K
//        给定一个数字arr，其中只有有两个数字出现了奇数次，其它数字都出现了偶数次，按照从小到大顺序输出这两个数。

public class TwtFive {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] a = new int[length];
        for (int i = 0; i < length; i++) {
            a[i] = in.nextInt();
        }
        Map<Integer, Integer> resultMap = new HashMap<>();
        for (Integer c : a) {
            resultMap.put(c, resultMap.getOrDefault(c, 0) + 1);
        }
        List<Integer> resultSet = new ArrayList<>();
        for (Map.Entry<Integer, Integer> curEntry : resultMap.entrySet()) {
            if (curEntry.getValue() % 2 == 1) {
                resultSet.add(curEntry.getKey());
            }
        }
        System.out.println(
                Math.min(resultSet.get(0), resultSet.get(1)) + " " + Math.max(resultSet.get(0), resultSet.get(1)));
    }
}
