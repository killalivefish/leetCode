package leetcode.honer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
//https://www.nowcoder.com/questionTerminal/11b7dd7cbf064900bc664bb5fd4e2fab?answerType=1&f=discussion
//https://leetcode.cn/problems/3sum/description/
public class Nineteen {
//    11 10
//            -8 -4 -3 0 1 1 2 4 4 8 9
    //    REMBER
    public static void main(String[] args) throws IOException {
  
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().split(" ");
        int n = Integer.parseInt(params[0]), k = Integer.parseInt(params[1]);
        params = br.readLine().split(" ");
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) nums[i] = Integer.parseInt(params[i]);
        for(int i = 0; i < n - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;     // 第一元素去重
            int target = k - nums[i];
            int left = i + 1;
            while(nums[left] == nums[i] && left < n - 1) left ++;       // 第二个元素不能等于第一个元素
            int right = n - 1;
            while(left < right){
                if(nums[left] + nums[right] > target){
                    right --;
                }else if(nums[left] + nums[right] < target){
                    left ++;
                }else{
                    if(nums[left] < nums[right]) System.out.println(nums[i] + " " + nums[left] + " " + nums[right]);
                    left ++;
                    right --;
                    while(nums[left] == nums[left - 1]) left ++;         // 第二元素去重
                    while(nums[right] == nums[right + 1]) right --;      // 第三元素去重
                }
            }
        }
        
    }
    
    public static void compare(int[] ints, int first, int second, int third, int target) {
        while (second < third) {
            int sum = ints[second] + ints[third];
            if (sum < target) {
                second++;
            } else if (sum > target) {
                third--;
            } else {
                System.out.println(ints[first] + " " + ints[second] + " " + ints[third]);
                while (second < third && ints[second] == ints[second + 1]) {
                    second++;
                }
                while (second < third && ints[third] == ints[third - 1]) {
                    third--;
                }
                second++;
                third--;
            }
        }
    }
}
