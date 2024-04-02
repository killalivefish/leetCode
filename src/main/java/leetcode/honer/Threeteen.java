package leetcode.honer;
//OK
//13.ACM编程题 【40分】 标题：n个数里出现次数大于等于n/2的数 | 时间限制：1秒 | 内存限制：32768K
//        输入n个整数，输出出现次数大于等于数组长度一半的数。
//https://www.nowcoder.com/practice/eac8c671a0c345b38aa0c07aba40097b?tpId=182&tqId=34787&ru=/exam/oj
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Threeteen {
    
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        Map<String,Integer> myMap = new HashMap<>();
        for (String s1 : s) {
            myMap.put(s1,myMap.getOrDefault(s1,0)+1);
        }
    
        for (Map.Entry<String, Integer> curEntry : myMap.entrySet()) {
            if(curEntry.getValue()>=s.length/2){
                System.out.print(curEntry.getKey());
            }
        }
    
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String[] array = a.split(" ");
        int aimInt = array.length/2;
        Map<String,Integer> map = new HashMap<>();
        for (String c : array) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<String, Integer> curEntry : map.entrySet()) {
            if(curEntry.getValue() >= aimInt){
                System.out.println(curEntry.getKey());
                break;
            }
        }
    }
}
