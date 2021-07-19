package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }
            map.put(num, map.get(num) + 1);

        }

        for (Map.Entry<Integer, Integer> curEntry : map.entrySet()) {
            if (curEntry.getValue() > nums.length / 2) {
                result = curEntry.getKey();
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int[] arr = new int[]{3, 2, 3};
        System.out.println(majorityElement.majorityElement(arr));
    }
}
