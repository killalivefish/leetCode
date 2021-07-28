package leetcode.easy;

//TODO youhua
public class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = i+1; j<nums.length && Math.abs(i-j) <= k ; j++) {
                if(nums[i] - nums[j] == 0){
                    return true;
                }
            }
        }

        return false;
    }
}
