package leetcode.medium;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ValidPartition {

    public boolean validPartition(int[] nums) {
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(numsList);

        //遍历存入linkedhashmap,key为当前num,value为出现次数。
        //如果出现次数有2次直接返回true
        LinkedHashMap<Integer,Integer>  freqMap = new LinkedHashMap<>();

        for (int i = 0; i <= numsList.size(); i++) {
            int curNum = numsList.get(i);
            if(freqMap.containsKey(curNum)){
                freqMap.put(curNum,freqMap.get(curNum)+1);
                if( freqMap.get(curNum)==3){
                    return true;
                }

            }else{
                freqMap.putIfAbsent(numsList.get(i),1);
            }
        }

        //判断三个数连续递增
        Integer[] objects = (Integer[])freqMap.keySet().toArray();

        for (int i = 0; i < objects.length; i++) {
            if(objects[i]+1==objects[i+1] && objects[i]+2 == objects[i+2]){
                return true;
            }
        }
        return false;
    }
}
