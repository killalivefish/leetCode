package leetcode.medium;

import java.util.*;

public class TimeMap {
    private Map<String, Map<Integer, String>> stock;

    public TimeMap() {
        stock = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!stock.containsKey(key)) {
            Map<Integer, String> temp = new TreeMap<>();
            temp.put(timestamp, value);
            stock.put(key, temp);
        } else {
            Map<Integer, String> tempMap = stock.get(key);
            tempMap.put(timestamp, value);
        }
    }

    public String get(String key, int timestamp) {
        if (!stock.containsKey(key)) {
            return "";
        } else {
            Map<Integer, String> tempMap = stock.get(key);
            if (tempMap.containsKey(timestamp)) {
                return tempMap.get(timestamp);
            } else {
                String result = "";
                for (int i = timestamp; i > 0; i--) {
                    if(tempMap.containsKey(i)){
                        result = tempMap.get(i);
                        break;
                    }
                }
                /*Integer[] intes = new Integer[tempMap.keySet().size()];
                tempMap.keySet().toArray(intes);
                Arrays.sort(intes);
                for (int i = 0; i < intes.length; i++) {
                    if (intes[i] > timestamp) {
                        break;
                    }
                    if(intes[i] < timestamp){
                        result = tempMap.get(intes[i]);
                    }
                }*/
                return result;
            }
        }
    }

    public static void main(String[] args) {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo","bar",1);
        timeMap.set("foo","bar2",4);
        System.out.println(timeMap.get("foo",1));
        System.out.println(timeMap.get("foo",3));
        System.out.println(timeMap.get("foo",4));
        System.out.println(timeMap.get("foo",5));
    }
}
