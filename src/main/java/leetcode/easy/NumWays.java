package leetcode.easy;

import java.util.*;

//TODO 两数之和
public class NumWays {
    public int numWays(int n, int[][] relation, int k) {
        Map<Integer, Set<Integer>> relaMap = new HashMap<Integer, Set<Integer>>(relation.length);
        for (int i = 0; i < relation.length; i++) {
            int zeroIndex = relation[i][0];
            if (!relaMap.containsKey(zeroIndex)) {
                relaMap.put(zeroIndex, new HashSet<Integer>());
            }
            relaMap.get(zeroIndex).add(relation[i][1]);
        }
        List<List<Integer>> stock = new ArrayList<List<Integer>>();

        int start = relation[0][0];
        int target = n - 1;

        return isThis(relaMap, start, target, 0, k);
    }

    private int isThis(Map<Integer, Set<Integer>> relaMap, int start, int target, int ci, int k) {
        int result = 0;
        int tempCi = 0;
        if (relaMap.containsKey(start)) {
            Set<Integer> integers = relaMap.get(start);
            tempCi++;
            if (tempCi == k && integers.contains(target)) {
                result += 1;
            } else {
                for (Integer integer : integers) {
                    result += isThis(relaMap, integer, target, tempCi, k);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{0,2},{2,1},{3,4},{2,3},{1,4},{2,0},{0,4}};
        NumWays numWays = new NumWays();
        System.out.println(numWays.numWays(5,arr,4));
    }
}
