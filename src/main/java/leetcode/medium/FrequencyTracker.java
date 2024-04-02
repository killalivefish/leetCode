package leetcode.medium;

import java.util.*;

public class FrequencyTracker {
    private Map<Integer, Integer> freMap;
    private Map<Integer, Integer> fre2Map;


    public FrequencyTracker() {
        this.freMap = new HashMap<>();
        this.fre2Map = new HashMap<>();
    }

    public void add(int number) {
        if (!freMap.containsKey(number)) {
            freMap.put(number, 0);
        }
        freMap.put(number, freMap.get(number)+1);
        this.fre2Map.put(freMap.get(number)+1,number);
    }

    public void deleteOne(int number) {
        if(freMap.containsKey(number) && freMap.get(number) > 0){
            freMap.put(number, freMap.get(number)-1);
            this.fre2Map.put(freMap.get(number)-1,number);
        }
    }

    public boolean hasFrequency(int frequency) {
        return this.fre2Map.containsKey(frequency);
    }
}
