package leetcode.easy.queue;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindRelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        if (score.length == 0) {
            return new String[]{};
        }
        Map<Integer, Integer> indexMap = new LinkedHashMap<>();
        int[] copy = Arrays.copyOf(score, score.length);
        Arrays.sort(copy);
        for (int length = copy.length; length > 0; length--) {
            indexMap.put(copy[length - 1], copy.length - length + 1);
        }

        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            Integer curIndex = indexMap.get(score[i]);
            if (curIndex == 0) {
                result[i] = "Gold Medal";
            } else if (curIndex == 1) {
                result[i] = "Silver Medal";
            } else if (curIndex == 2) {
                result[i] = "Bronze Medal";
            } else {
                result[i] = curIndex + "";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindRelativeRanks find = new FindRelativeRanks();
        find.findRelativeRanks(new int[]{5, 4, 3, 2, 1});
    }
}
