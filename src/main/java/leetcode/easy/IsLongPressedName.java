package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsLongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        String sb = "";
        Character lastChar = null;
        List<Map<Character, Integer>> temp = new ArrayList<>();
        for (int i = 0; i < name.length(); i++) {
            char curChar = name.charAt(i);
            if (temp.isEmpty() || !temp.get(temp.size() - 1).containsKey(curChar)) {
                Map<Character, Integer> curEntry = new HashMap<>();
                curEntry.put(curChar, 1);
                temp.add(curEntry);
            } else {
                Map<Character, Integer> curMap = temp.get(temp.size() - 1);
                curMap.put(curChar, curMap.get(curChar) + 1);
            }
        }

        for (Map<Character, Integer> charNumMap : temp) {
            for (Map.Entry<Character, Integer> curEntry : charNumMap.entrySet()) {
                int tempNum = 0;
                for (int i = 0; i < typed.length(); i++) {
                    char curChar = typed.charAt(i);
                    if (curChar == curEntry.getKey()) {
                        ++tempNum;
                    } else {
                        break;
                    }
                }
//                System.out.println(curEntry.getKey()+":"+tempNum);
                if (typed.length()>0 && tempNum >= curEntry.getValue()) {
                    typed = typed.substring(tempNum);
//                    System.out.println(typed);
                } else {
                    return false;
                }
            }
        }
//        System.out.println("=========");
        return typed.isEmpty();
    }

    public static void main(String[] args) {
        IsLongPressedName isLongPressedName = new IsLongPressedName();
        //    name = "saeed", typed = "ssaaedd"
        System.out.println(isLongPressedName.isLongPressedName("saeed", "ssaaedd"));
//        name = "alex", typed = "aaleex"
        System.out.println(isLongPressedName.isLongPressedName("alex", "aaleex"));
//name = "leelee", typed = "lleeelee"
        System.out.println(isLongPressedName.isLongPressedName("leelee", "lleeelee"));
//name = "laiden", typed = "laiden"
        System.out.println(isLongPressedName.isLongPressedName("laiden", "laiden"));
//        "alex"
//        "aaleexa"
        System.out.println(isLongPressedName.isLongPressedName("alex", "aaleexa"));
    }
}
