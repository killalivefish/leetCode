package leetcode.medium;

import java.util.Arrays;

public class MaxIceCream {
    public int maxIceCream(int[] costs, int coins) {

        Arrays.sort(costs);
        int temp = 0;
        int num = 0;
        for (int cost : costs) {
            temp += cost;
            if (temp <= coins) {
                num++;
            } else {
                break;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 6, 3, 1, 2, 5};
        int[] arr1 = new int[]{10, 6, 8, 7, 7, 8};
        int[] arr2 = new int[]{1, 3, 2, 4, 1};
        MaxIceCream maxIceCream = new MaxIceCream();
        System.out.println(maxIceCream.maxIceCream(arr, 20));
        System.out.println(maxIceCream.maxIceCream(arr1, 5));
        System.out.println(maxIceCream.maxIceCream(arr2, 7));
    }
}
