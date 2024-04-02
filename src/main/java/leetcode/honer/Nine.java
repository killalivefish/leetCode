package leetcode.honer;

import java.util.Arrays;
import java.util.Scanner;

//9.【40分】 标题：二分查找 | 时间限制：1秒 | 内存限制：65536K
//        请实现有重复数字的升序数组的二分查找。
//REMBER
public class Nine {
    
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int arrLength = Integer.parseInt(in.nextLine());
//        int aimInt = Integer.parseInt(in.nextLine());
//        String b = in.nextLine();
//
//        String[] strArray = b.split(" ");
//        int low = 0;
//        int high = strArray.length - 1;
//        int imd = (low / high) / 2;
//
//        while (low <= high) {
//            imd = (low / high) / 2;
//            if (Integer.parseInt(strArray[imd]) == aimInt) {
//                System.out.println(strArray[imd]);
//                break;
//            }else if(Integer.parseInt(strArray[imd]) > aimInt){
//                high=imd-1;
//            }else{
//                low = imd+1;
//            }
//        }
//        if(low>high){
//            System.out.println(-1);
//        }
        int[] arr = {1,2,4,4,5};
        System.out.println(search(arr,4));
    }
    
    public static int search (int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int imd = (high - low) / 2;
        
        while (low <= high) {
            imd = low+(high - low) / 2;
            if (nums[imd] == target) {
                while(imd!=0 && nums[imd-1] ==nums[imd]){
                    imd--;
                }
                return imd;
            } else if (nums[imd] > target) {
                high = imd - 1;
            } else {
                low = imd + 1;
            }
        }
        return -1;
    }
}
