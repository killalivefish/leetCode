package leetcode.honer;

import java.util.Arrays;
import java.util.Scanner;

//19.【40分】 标题：不重复打印排序数组中相加和为给定值的所有三元组 | 时间限制：2秒 | 内存限制：262144K
//    给定排序数组arr和整数k，不重复打印arr中所有相加和为k的严格升序的三元组
//    例如, arr = [-8, -4, -3, 0, 1, 1, 2, 4, 5, 8, 9], k = 10，打印结果为：
//            -4 5 9
//            -3 4 9
//            -3 5 8
//            0 1 9
//            0 2 8
//            1 4 5
//    其中三元组1 1 8不满足严格升序所以不打印
public class Nineteen {
//    REMBER
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] aims= in.nextLine().split(" ");
        int length = Integer.parseInt(aims[0]);
        int target = Integer.parseInt(aims[1]);
        
        String[] array= in.nextLine().split(" ");
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(ints);
    
        for (int first = 0; first < length-2; first++) {
            if(first>0&& ints[first]==ints[first-1]){
                continue;
            }
            int second = first+1;
            int third = length-1;
            while (second<third){
                int sum =  ints[first]+ints[second]+ints[third];
                if(sum<target){
                    second++;
                }else if(sum>target){
                    third--;
                }else{
                    System.out.println(ints[first]+" "+ints[second]+" "+ints[third]);
                    while(second<third && ints[second] == ints[second+1]) {
                        second++;
                    }
                    while(second<third && ints[third] == ints[third-1]) {
                        third--;
                    }
                    second++;
                    third--;
                }
            }
        }
        
    }
}
