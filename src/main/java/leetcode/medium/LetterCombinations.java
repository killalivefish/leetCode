package leetcode.medium;

import java.util.*;

//TODO
public class LetterCombinations {
    private final static Map<Character,char[]> charMap = new HashMap<>(8);
    static {
        charMap.put('2',new char[]{'a','b','c'});
        charMap.put('3',new char[]{'d','e','f'});
        charMap.put('4',new char[]{'g','h','i'});
        charMap.put('5',new char[]{'j','k','l'});
        charMap.put('6',new char[]{'m','n','o'});
        charMap.put('7',new char[]{'p','q','r','s'});
        charMap.put('8',new char[]{'t','u','v'});
        charMap.put('9',new char[]{'w','x','y','z'});
    }

    public List<String> letterCombinations(String digits) {
        List<String> resultSet = new ArrayList<>();

        for (int i = 0; i < digits.length(); i++) {
            char curChar = digits.charAt(i);
        }

        return null;
    }

    private void addStr(int index,String digite,List<String> result){
        if(index < digite.length()){

        }
        String str = new String();

    }
}
