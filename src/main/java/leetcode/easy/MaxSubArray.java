package leetcode.easy;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            int temp = 0;
            for (int j = i + 1; j < length; j++) {
                temp = nums[i] + nums[j];
                System.out.println("i="+i+" j="+j+" temp="+temp);
                max = Math.max(max, temp);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        MaxSubArray maxSubArray = new MaxSubArray();
        System.out.println(maxSubArray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
//        System.out.println(maxSubArray.maxSubArray(new int[]{-1}));
//        System.out.println(maxSubArray.maxSubArray(new int[]{-10000}));
    }
}
