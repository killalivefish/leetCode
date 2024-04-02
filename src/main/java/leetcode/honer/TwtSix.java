package leetcode.honer;

import java.util.Arrays;
import java.util.Scanner;

//26.完善核心代码 语言限制 【40分】 标题：数组排序之后相邻数的最大差值 | 时间限制：2秒 | 内存限制：262144K
//        给定一个整形数组arr，返回排序后相邻两数的最大差值
//        arr = [9, 3, 1, 10]。如果排序，结果为[1, 3, 9, 10]，9和3的差为最大差值，故返回6。
//        arr = [5, 5, 5, 5]。返回0。

public class TwtSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[]  arr1 = new int[]{9,3,1,10};
        int[]  arr2 = new int[]{5,5,5,5};
        System.out.println(cc(arr1));
        System.out.println(cc(arr2));
    }
    
    public static int cc(int[] numArray){
        Arrays.sort(numArray);
        int maxCha = 0;
        for (int i = 0; i < numArray.length; i++) {
            if(i<numArray.length-1){
                int temp = numArray[i+1]-numArray[i];
                maxCha = Math.max(temp,maxCha);
            }
        }
        
        return maxCha;
    }
}
