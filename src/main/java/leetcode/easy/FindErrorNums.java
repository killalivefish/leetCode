package leetcode.easy;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//todo
public class FindErrorNums {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        if(nums.length == 2) {
            result[0] = nums[0];
            if(nums[0] == 1){
                result[1] = nums[0] + 1;
            }else{
                result[1] = nums[0] - 1;
            }
            return result;
        }

        Map<Integer, Integer> numAndCount = new HashMap<Integer, Integer>();
        Integer errorNum = null;
        for (int num : nums) {
            if (!numAndCount.containsKey(num)) {
                numAndCount.put(num, 1);
            } else {
                numAndCount.put(num, numAndCount.get(num) + 1);
                errorNum = num;
                result[0] = num;
            }
        }
        Object[] values = numAndCount.values().toArray();
        Arrays.sort(values);
        boolean inEnd = values[values.length -1] == errorNum;


        if (!numAndCount.containsKey(errorNum + 1)) {
            result[1] = errorNum + 1;
        } else {
            result[1] = errorNum - 1;
        }

        return result;
    }

    public static void main(String[] args) {
        FindErrorNums findErrorNums = new FindErrorNums();
        int[] arr = new int[]{2, 2};
        int[] errorNums = findErrorNums.findErrorNums(arr);
        for (int errorNum : errorNums) {
            System.out.print(errorNum);

        }
    }
}
