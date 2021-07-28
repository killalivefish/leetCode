package leetcode.easy;

import java.util.HashSet;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

//TODO error
public class CountGoodSubstrings {
    public int countGoodSubstrings(String s) {
        int result = 0;
        for (int i = 0; i < s.length()-3; i++) {
            char c = s.charAt(i);
            Set<Character> set = new HashSet<>();
            set.add(c);
            for (int j = i+1; j < i+3; j++) {
                char curChar = s.charAt(j);
                if(!set.contains(curChar)){
                    set.add(curChar);
                }else{
                    break;
                }
                if(set.size() ==3){
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CountGoodSubstrings countGoodSubstrings = new CountGoodSubstrings();
        System.out.println(countGoodSubstrings.countGoodSubstrings("xyzzaz"));
    }
}
