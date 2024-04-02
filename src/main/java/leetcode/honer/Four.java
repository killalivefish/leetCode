package leetcode.honer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//OK
//4.ACM编程题 【40分】 标题：数组的partition调整补充问题 | 时间限制：2秒 | 内存限制：262144K
//        给定一个数组arr，其中只可能含有0、1、2三个值，请实现arr的排序

public class Four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        
        String[] strArray = b.split(" ");
        Arrays.sort(strArray);
        
        for(String str : strArray){
            System.out.print(str+" ");
        }
    }
}
