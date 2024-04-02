package leetcode.medium;

import java.util.*;

//TODO 内存消耗太大 47.42MB！
public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!freMap.containsKey(nums[i])) {
                freMap.put(nums[i], 1);
            } else {
                freMap.put(nums[i], freMap.get(nums[i]) + 1);
            }
        }
        System.out.println("====freMap==========");
        System.out.println(freMap);



        //自定义比较器
        Comparator<Map.Entry<Integer, Integer>> valCmp = new Comparator<Map.Entry<Integer,Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue()-o1.getValue();  // 降序排序，如果想升序就反过来
            }
        };
        //将map转成List，map的一组key，value对应list一个存储空间
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(freMap.entrySet()); //传入maps实体
        Collections.sort(list,valCmp); // 注意此处Collections 是java.util包下面的,传入List和自定义的valCmp比较器
        System.out.println("====list==========");
        System.out.println(list);

        int[] resultArray = new int[k];
        for (int i = 0; i < k; i++) {
            resultArray[i] = list.get(i).getKey();
        }
        System.out.println("====result==========");
        for (int i : resultArray) {
            System.out.println(i);
        }

        return resultArray;
    }

    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        Map<String,Integer> freMap = new HashMap<>();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (!freMap.containsKey(word.charAt(i))) {
                    freMap.put(word.charAt(i)+"", 1);
                } else {
                    freMap.put(word.charAt(i)+"", freMap.get(word.charAt(i)+"") + 1);
                }
            }
        }

        System.out.println(freMap);
        System.out.println("==========");
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> curEntry : freMap.entrySet()) {
            if(curEntry.getValue() == words.length){
                result.add(curEntry.getKey());
                System.out.println(curEntry.getKey());
            }
        }

    }
}
