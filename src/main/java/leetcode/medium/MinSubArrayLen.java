package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

//TODDO time out
public class MinSubArrayLen {
    public int minSubArrayLen(int target, int[] nums) {
        List<List<Integer>> temp = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            List<Integer> curTemp = new ArrayList<>();
            int curCount =0;
            curTemp.add(nums[i]);
            curCount+=nums[i];
            if(curCount >= target){
                temp.add(curTemp);
                break;
            }
            for (int j = i+1; j < nums.length; j++) {
                curCount+=nums[j];
                curTemp.add(nums[j]);

                if(curCount >= target){
                    temp.add(curTemp);
                    break;
                }
            }
        }

        if(temp.isEmpty()){
            return 0;
        }
        int result = Integer.MAX_VALUE;
        for (List<Integer> integers : temp) {
            result = Math.min(result,integers.size());
        }

        return result;
    }
}
