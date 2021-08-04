package leetcode.easy.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthLargest {
    int k;
    List<Integer> data;

    public KthLargest(int k, int[] nums) {
        this.k= k;
        data = new ArrayList<>();
        for (int num : nums) {
            data.add(num);
        }
    }

    public int add(int val) {
        data.add(val);
        List<Integer> copy = new ArrayList<>();
        for (Integer datum : data) {
            copy.add(datum);
        }
        Collections.sort(copy);
        return copy.get(k-1);
    }
}
