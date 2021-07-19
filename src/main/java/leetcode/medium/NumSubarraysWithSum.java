package leetcode.medium;

public class NumSubarraysWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (temp == goal) {
                result += 1;
            }
            for (int j = i + 1; j < nums.length; j++) {
                temp += nums[j];
                if (temp == goal) {
                    result += 1;
                }
                if (temp > goal) {
                    break;
                }
            }
        }

        return result;
    }
}
