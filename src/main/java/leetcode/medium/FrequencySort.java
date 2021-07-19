package leetcode.medium;

import java.util.*;

public class FrequencySort {
    public String frequencySort(String s) {
        Map<Character,Integer> tempMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!tempMap.containsKey(c)){
                tempMap.put(c,1);
            }else{
                Integer integer = tempMap.get(c) +1;
                tempMap.put(c,integer);
            }
        }


        Map<Integer, Set<Character>> tempMap2 = new HashMap<Integer, Set<Character>>();
        for (Map.Entry<Character, Integer> curEntry : tempMap.entrySet()) {
            Integer value = curEntry.getValue();
            Character key = curEntry.getKey();
            if(!tempMap2.containsKey(value)){
                tempMap2.put(value,new HashSet<Character>());
            }
            tempMap2.get(value).add(key);
        }

        StringBuilder sb =new StringBuilder();
        Object[] objects = tempMap.values().toArray();
        Arrays.sort(objects);
        Set<Integer> sortInt = new LinkedHashSet<Integer>();
        for (int i = objects.length - 1; i >= 0; i--) {
            sortInt.add((Integer) objects[i]);
        }

        for (Integer object : sortInt) {
            for (Character character : tempMap2.get(object)) {
                for (Integer i = 0; i < (object); i++) {
                    sb.append(character);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        FrequencySort frequencySort = new FrequencySort();
        System.out.println(frequencySort.frequencySort("tree"));
        System.out.println(frequencySort.frequencySort("cccaaa"));
        System.out.println(frequencySort.frequencySort("Aabb"));
//        System.out.println(frequencySort.frequencySort("tree"));
    }
}
