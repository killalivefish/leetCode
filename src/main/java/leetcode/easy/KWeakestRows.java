package leetcode.easy;

import java.util.*;

public class KWeakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer,List<Integer>> coutRows = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            int solderNum = 0;
            for (int i1 = 0; i1 < mat[i].length; i1++) {
                if(mat[i][i1]!=0){
                    solderNum++;
                }else{
                    break;
                }
            }
            if(!coutRows.containsKey(solderNum)){
                coutRows.put(solderNum,new ArrayList<>());
            }
            coutRows.get(solderNum).add(i);
        }

        List<Integer> sorted = new ArrayList<>(coutRows.keySet());
        Collections.sort(sorted);
        List<Integer> arr = new ArrayList<>();
        for (Integer integer : sorted) {
            Collections.sort(coutRows.get(integer));
            arr.addAll(coutRows.get(integer));
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        KWeakestRows kWeakestRows = new KWeakestRows();
        int[][] mat ={
                {1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}
        };
        int[] ints = kWeakestRows.kWeakestRows(mat, 3);
        for (int anInt : ints) {
            System.out.print(anInt);
        }
    }
}
