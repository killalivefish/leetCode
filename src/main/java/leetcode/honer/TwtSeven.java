package leetcode.honer;

import java.util.Scanner;

//27.完善核心代码 语言限制 【40分】 标题：二进制插入 | 时间限制：3秒 | 内存限制：32768K
//        给定两个32位整数n和m，同时给定i和j，将m的二进制数位插入到n的二进制的第j到第i位,保证n的第j到第i位均为零，且m的二进制位数小于等于i-j+1，其中二进制的位数从0开始由低到高。
//
public class TwtSeven {
//    REMBER
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(binInsert(array[0],array[1],array[2],array[3]));
    }
    public static int binInsert(int n, int m, int j, int i) {
        m = m << j;
        return n + m;
    }
}
