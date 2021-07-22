package leetcode.easy.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        return strToMap(s).equals(strToMap(t));
    }

    private String strToMap(String str) {
        Map<Character, String> result = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            if (!result.containsKey(curChar)) {
                result.put(curChar, "");
            }
            result.put(curChar, result.get(curChar) + i);
        }
        StringBuilder sb = new StringBuilder();
        for (String value : result.values()) {
            sb.append(value);
            sb.append(",");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        IsIsomorphic isIsomorphic = new IsIsomorphic();
        System.out.println(isIsomorphic.isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic.isIsomorphic("eg", "ad"));
        System.out.println(isIsomorphic.isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic.isIsomorphic("paper", "title"));
    }
}
