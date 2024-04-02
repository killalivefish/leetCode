package leetcode.honer;

import java.util.Scanner;


//24.ACM编程题 【40分】 标题：密码验证合格程序 | 时间限制：1秒 | 内存限制：32768K
//        密码要求:
//        1.长度超过8位
//        2.包括大小写字母.数字.其它符号,以上四种至少三种
//        3.不能有长度大于2的不含公共元素的子串重复 （注：其他符号不含空格或换行）
//        数据范围：输入的字符串长度满足1<=n<=100

public class TwtFour {
    
    public static void main(String[] args) {
        System.out.println(cc("021Abc9000") ? "OK" : "NG");
        System.out.println(cc("021Abc9Abc1") ? "OK" : "NG");
        System.out.println(cc("021ABC9000") ? "OK" : "NG");
        System.out.println(cc("021$bc9000") ? "OK" : "NG");
    }
    
    public static boolean cc(String str) {
        if (str.length() <= 8 || str.length() >= 100) {
            return false;
        }
        char[] chars = str.toCharArray();
        int num=0,up=0,lower=0,other=0;
        for (char c : chars) {
            if (c >= 'a' && c <= 'z') {
                lower=1;
                continue;
            }
            if (c >= 'A' && c <= 'Z') {
                up=1;
                continue;
            }
            if (c >= '0' && c <= '9') {
                num=1;
                continue;
            }
            if (c != ' ' && c != '\n') {
                other=1;
                continue;
            }
        }
        if ((num+lower+up+other) < 3) {
            return false;
        }
        for (int i = 0; i < chars.length - 2; i++) {
            String temp = str.substring(i, i + 3);
            if (str.substring(i + 3).contains(temp)) {
                return false;
            }
        }
        
        return true;
    }
}
