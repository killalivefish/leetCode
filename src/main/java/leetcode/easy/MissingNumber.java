package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int max = nums.length;
        int result = 0;
        Map<Integer,Integer> tempMap = new HashMap<>(max);
        for (int i = 0; i < max; i++) {
            tempMap.put(nums[i],i);
        }

        for (int i = 0; i <= nums.length; i++) {
            if(!tempMap.containsKey(i)){
                result = i;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        System.out.println(missingNumber.missingNumber(new int[]{3,0,1}));
        System.out.println(missingNumber.missingNumber(new int[]{0,1}));
        System.out.println(missingNumber.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        System.out.println(missingNumber.missingNumber(new int[]{0}));
    }
}
