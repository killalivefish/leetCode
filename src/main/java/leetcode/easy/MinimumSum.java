package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class MinimumSum {
    public int minimumSum(int[] nums) {
        
        int result = -1;
        Set<Integer> myset = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            if(nums[i+1]>nums[i]&& nums[i]<nums[i+2]){
                int temp = nums[i]+nums[i+1]+nums[i+2];
                myset.add(temp);
            }
        }
    
        for (Integer integer : myset) {
            if(integer>-1){
                result = integer;
                break;
            }
        }
//        return myset.get(0)>-1? myset.get(0):-1;
        return result;
    }
}
