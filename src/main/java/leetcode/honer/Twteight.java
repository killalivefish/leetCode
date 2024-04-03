package leetcode.honer;

import java.util.Scanner;

//28.ACM编程题 【40分】 标题：统计每个月兔子的总数 | 时间限制：1秒 | 内存限制：32768K
//        有一种兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子。
//        例子：假设一只兔子第3个月出生，那么它第5个月开始会每个月生一只兔子。
//        一月的时候有一只兔子，假如兔子都不死，问第n个月的兔子总数为多少？
//https://www.nowcoder.com/practice/1221ec77125d4370833fd3ad5ba72395
public class Twteight {

//    REMBER
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int twoMon = 1;//最开始只有一只兔子且还需两个月进入生产
            int oneMon = 0;
            int add = 0;//处于繁殖阶段的兔子
            int month = 2;//第一次计数操作是经过一个月之后才进行的，即是在第2个月
            //进行的，第一个月并不进行任何操作
            while(month <= n){//在第n个月仍会产生一批小兔子，所以需要进行一次计数操作，
                //所以需要小于等于n
                add += oneMon;//兔子不会死亡，处于繁殖阶段的兔子只会越来越多，不断地由
                //仅剩一个月的兔子转化而来
                oneMon = twoMon;//仅剩一月的兔子全部转入生产，而后剩二月的兔子全部变为
                //一月
                twoMon = add;//进入生产阶段的兔子在进入的这个月就会生产一只兔子
                //所以要先加上oneMon，本月出生的小兔子即为还剩两月的兔子
                month++;//月数自增
            }
            System.out.println(twoMon+oneMon+add);
        }
    }
    
    public static int f(int n){
        if(n==1 || n==2){
            return 1;
        }
        return f(n-1)+f(n-2);
    }
}
