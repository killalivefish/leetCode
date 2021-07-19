package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class IsUnique {
    public boolean isUnique(String astr) {
        Map<Character,Integer> temp =new HashMap<>();
        for (int i = 0; i < astr.length(); i++) {
            if(!temp.containsKey(astr.charAt(i))){
                temp.put(astr.charAt(i),1);
            }else{
                return false;
            }
        }

        return true;
    }
}
