package leetcode.medium;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

//todo "c"--> 1 " "-->1
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s == " "){
            return 1;
        }
        int maxLength = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            Set<Character> tenpSet = new LinkedHashSet<>();
            tenpSet.add(s.charAt(i));
            sb.append(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (tenpSet.contains(s.charAt(j))) {
                    if (tenpSet.size() > maxLength) {
                        maxLength = tenpSet.size();
                        result = sb;
                    }
                    break;
                }
                tenpSet.add(s.charAt(j));
                sb.append(s.charAt(j));
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring a = new LengthOfLongestSubstring();
        System.out.println(a.lengthOfLongestSubstring(""));
        System.out.println(a.lengthOfLongestSubstring(" "));

    }
}
