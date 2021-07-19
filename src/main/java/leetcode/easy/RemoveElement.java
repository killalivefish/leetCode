package leetcode.easy;

import java.util.Arrays;

//DO it Tomorry
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val){
                result++;
                for (int j = nums.length-1; j > i; j--) {
                    if(nums[j]!=val){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] nums = new int[]{3,2,2,3};
        int newLength = re.removeElement(nums,3);
        System.out.println(newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i]);
        }

    }
}
