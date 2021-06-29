package leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3){
            return Collections.emptyList();
        }

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int first = 0;
        int second = 1;
        int third = 3;
        for (;first < nums.length - 2;first++){
            int curFirst = nums[first];

            for(;second < nums.length - 1; second++){
                int curSecond = nums[second];

                for(;third < nums.length; third++){
                    int curThrid = nums[third];
                    if(curFirst + curSecond + curThrid == 0){
                        List<Integer> temp = new ArrayList<Integer>(3);
                        temp.add(curFirst);
                        temp.add(curSecond);
                        temp.add(curThrid);
                        result.add(temp);
                    }
                }
            }
        }

        return result;
    }


}
