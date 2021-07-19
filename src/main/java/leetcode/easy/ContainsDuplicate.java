package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> tempMap = new HashMap<>();
        for (int num : nums) {
            if(!tempMap.containsKey(num)){
                tempMap.put(num,1);
            }else{
                tempMap.put(num,tempMap.get(num)+1);
            }
        }

        int num = 0;
        for (Integer value : tempMap.values()) {
            if(value ==1){
                ++num;
            }
        }
        return !(num==tempMap.values().size());
    }

    public static void main(String[] args) {
        ContainsDuplicate dou = new ContainsDuplicate();
        System.out.println(dou.containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(dou.containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(dou.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}
