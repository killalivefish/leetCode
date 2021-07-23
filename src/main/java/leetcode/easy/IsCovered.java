package leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TODO 看不懂题
public class IsCovered {
    public boolean isCovered(int[][] ranges, int left, int right) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < ranges.length; i++) {
            for (int i1 : ranges[i]) {
                if (left <= i1 && i1 <= right) {
                    temp.add(i1);
                }
            }
        }
        if(temp.isEmpty()){
            return false;
        }
        Collections.sort(temp);
        if (temp.get(0) == left && temp.get(temp.size() - 1) == right && temp.size() == (right - left + 1)) {
            return true;
        }

        return false;
    }
}
