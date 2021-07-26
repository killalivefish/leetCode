package leetcode.hard;

import java.util.*;

//TODO
//[16,7,20,11,15,13,10,14,6,8]
//[11,14,15,7,5,5,6,10,11,6]
public class MinOperations {
    public int minOperations(int[] target, int[] arr) {
        List<Integer> source = new ArrayList<>();
        for (int i : arr) {
            source.add(i);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < target.length; i++) {
            List<Integer> tempList = new ArrayList<>();
            tempList.add(target[i]);
            if(containsArr(tempList,source)){
                max=Math.max(max,tempList.size());
            }
            for (int j = i+1; j < target.length; j++) {
                tempList.add(target[j]);
                if(containsArr(tempList,source)){
                    max=Math.max(max,tempList.size());
                }
            }
        }

        return target.length - max;
    }

    private boolean containsArr(List<Integer> target,List<Integer> source){
        int j = 0;
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < target.size(); i++) {
            for (; j < source.size(); j++) {
                if(target.get(i) == source.get(j)){
                    temp.add(target.get(i));
                    ++j;
                    break;
                }
            }
        }

        return target.size() == temp.size() && target.containsAll(temp);
    }

    public static void main(String[] args) {
        MinOperations minOperations = new MinOperations();
//        System.out.println(minOperations.minOperations(new int[]{6,4,8,1,3,2},new int[]{4,7,6,2,3,8,6,1}));
        System.out.println(minOperations.minOperations(new int[]{5,1,3},new int[]{9,4,2,3,4}));
    }
}
