package leetcode.medium;

import java.util.Arrays;

public class mAximumElementAfterDecrementingAndRearranging {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int length = arr.length;
        if (length == 1) {
            return 1;
        }

        Arrays.sort(arr);
        for (int i = 1; i < length; i++) {
            if (arr[0] > 1) {
                arr[0] = 1;
            }
            int abs = Math.abs(arr[i] - arr[i - 1]);
            if (abs > 1) {
                arr[i] = arr[i - 1] + 1;
            }
        }

        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        mAximumElementAfterDecrementingAndRearranging m = new mAximumElementAfterDecrementingAndRearranging();
        System.out.println(m.maximumElementAfterDecrementingAndRearranging(new int[]{2, 2, 1, 2, 1}));
        System.out.println(m.maximumElementAfterDecrementingAndRearranging(new int[]{100, 1, 1000}));
        System.out.println(m.maximumElementAfterDecrementingAndRearranging(new int[]{1, 2, 3, 4, 5}));
    }
}
