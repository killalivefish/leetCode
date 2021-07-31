package leetcode.easy;

import java.util.HashMap;
import java.util.Map;
//1 2 1 1 2 3 2

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int one = 0;
        int two = 1;
        while (two < nums.length) {
            if (nums[one] < nums[two]) {
                nums[one + 1] = nums[two];
                one++;
            }
            two++;
        }

        return one + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.println(removeDuplicates.removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}
