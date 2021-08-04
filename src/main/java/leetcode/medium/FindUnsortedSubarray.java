package leetcode.medium;

import java.util.Arrays;

//TODO error
public class FindUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int[] ints = Arrays.copyOf(nums, nums.length);
        Arrays.sort(ints);
        int max = 0;
        int temp = 0;
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] == nums[i]){
                temp = 0;
                continue;
            }else{
                ++temp;
                max=Math.max(max,temp);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        FindUnsortedSubarray find = new FindUnsortedSubarray();
        find.findUnsortedSubarray(new int[]{2,6,4,8,10,9,15});
    }
}
