package leetcode.honer;

import java.util.Scanner;

//29.ACM编程题 【40分】 标题：求小球落地5次后所经历的路程和第5次反弹的高度 | 时间限制：1秒 | 内存限制：32768K
//        假设一个球从任意高度自由落下，每次落地后反跳回原高度的一半; 再落下, 求它在第5次落地时，共经历多少米?第5次反弹多高？
//
//        数据范围：输入的小球初始高度满足 1<=n<=1000,且保证是一个整数

public class Twtnin {
//    REMBER
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double height = in.nextInt();
        
        System.out.println(height+(height/2)*2+(height/4)*2+(height/8)*2+(height/16)*2);
        System.out.println(height/32);
    }
}
