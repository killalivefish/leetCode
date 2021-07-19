package leetcode.easy;

//todo user er fen search
public class Search {
    public int search(int[] nums, int target) {
        int temp = 0;
        for (int num : nums) {
            temp += (num == target ? 1 : 0);
        }
        return temp;
    }
}
