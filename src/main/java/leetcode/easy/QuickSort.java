package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static List<Integer> quickSort(List<Integer> arr) {
        if (arr.size() < 2) {
            return arr;
        }
        int temp = arr.get(0);
        List<Integer> smallArray = new ArrayList<Integer>();
        List<Integer> bigArray = new ArrayList<Integer>();

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) <= temp) {
                smallArray.add(arr.get(i));
            } else {
                bigArray.add(arr.get(i));
            }
        }
        List<Integer> tempArr = new ArrayList<Integer>(1);
        tempArr.add(temp);
        smallArray = quickSort(smallArray);
        smallArray.addAll(tempArr);
        smallArray.addAll(quickSort(bigArray));
        return smallArray;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(23);
        arr.add(2);
        arr.add(44);
        arr.add(1);
        arr.add(75);

        List<Integer> integers = quickSort(arr);
        System.out.println(integers.toString());
    }
}
