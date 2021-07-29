package leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindRepeatedDnaSequences {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> tempSet = new HashSet<>();
        HashSet<String> resultSet = new HashSet<>();
        for (int i = 0; i < s.length() -9; i++) {
            String substring = s.substring(i, i + 10);
            if(!tempSet.contains(substring)){
                tempSet.add(substring);
            }else{
                resultSet.add(substring);
            }
        }
        return new ArrayList<>(resultSet);
    }
}
