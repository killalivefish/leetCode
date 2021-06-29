package leetcode.easy;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int result = 0;
        Integer minIndex = null;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (target == temp) {
                result = i;
            }
            if (temp < target) {
                minIndex = i;
            }
        }
        if (result == 0 && minIndex != null) {
            result = minIndex + 1;
        }
        if(result == 0 && minIndex == null){
            result = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        SearchInsert searchInsert = new SearchInsert();
        int[] array = new int[]{1, 3, 5, 6};
        System.out.println(searchInsert.searchInsert(array, 5));
        System.out.println(searchInsert.searchInsert(array, 2));
        System.out.println(searchInsert.searchInsert(array, 7));
        System.out.println(searchInsert.searchInsert(array, 0));


    }
}
