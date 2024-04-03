package leetcode.honer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//11.ACM编程题 【40分】 标题：求最小公倍数 | 时间限制：1秒 | 内存限制：32768K
//        正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。

public class Eleve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            for(int i=Math.max(a,b);i<=a*b;i++){
                if(i%a== 0 && i%b==0){
                    System.out.print(i);
                    break;
                }
            }
        }
        in.close();
    }
}
