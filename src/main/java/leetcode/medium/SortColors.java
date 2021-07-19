package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TODO why
public class SortColors {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
        /*List<Integer> zeros = new ArrayList<>();
        List<Integer> ones = new ArrayList<>();
        List<Integer> twos = new ArrayList<>();
        for (int num : nums) {
            if(num == 0){
                zeros.add(num);
            }else if(num == 1){
                ones.add(num);
            }else{
                twos.add(num);
            }
        }
        zeros.addAll(ones);
        zeros.addAll(twos);
        int[] temp = new int[zeros.size()];
        for (int i = 0; i < zeros.size(); i++) {
            temp[i] = zeros.get(i);
        }
        nums = temp;*/
    }
}
