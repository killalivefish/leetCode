package leetcode.honer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//18.【40分】 标题：计算某字符出现次数 | 时间限制：1秒 | 内存限制：32768K
//        写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数。（不区分大小写字母）

public class Eighteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String aimStr = in.nextLine();
        char[] array = a.toCharArray();
        int result = 0;
        for (char c : array) {
            if(aimStr.equalsIgnoreCase(c+"")){
                result++;
            }
        }
        System.out.println(result);
        
    }
    
}
