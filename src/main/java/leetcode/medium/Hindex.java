package leetcode.medium;

import java.util.*;

public class Hindex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int max = citations[citations.length - 1];
        Map<Integer, Integer> temp = new HashMap<>();
        for (int i = max; i > 0; i--) {
            int tempCount = 0;
            for (int citation : citations) {
                if (citation == 0) {
                    continue;
                }
                if (citation >= i) {
                    tempCount++;
                }
            }
            temp.put(i, tempCount);
        }

        int result = 0;
        for (Map.Entry<Integer, Integer> curEntry : temp.entrySet()) {
            System.out.println(curEntry.getKey()+":"+curEntry.getValue());
            if (curEntry.getKey() == curEntry.getValue()) {
                result = Math.max(curEntry.getKey(), result);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] cid = new int[]{3,0,6,1,5};
        Hindex hindex = new Hindex();
        System.out.println(hindex.hIndex(cid));
    }
}
