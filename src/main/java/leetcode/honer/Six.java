package leetcode.honer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//6. 标题：在数组中找到出现次数大于n/k的数 | 时间限制：2秒 | 内存限制：262144K
//        给定一个整型数组arr，再给定一个整数k，打印所有出现次数大于n/k的数，如果没有这样的数,请打印”-1“。

public class Six {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        String[] aArray = a.split(" ");
        int result = Integer.parseInt(aArray[0]) / Integer.parseInt(aArray[1]);
        String[] strArray = b.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (String s : strArray) {
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> curEntry : map.entrySet()) {
            if(curEntry.getValue() > result){
                resultList.add(curEntry.getKey());
            }
        }
        if(resultList.isEmpty()){
            System.out.print("-1");
        }else{
            for (String s : resultList) {
                System.out.print(s+" ");
            }
        }
    }
}
