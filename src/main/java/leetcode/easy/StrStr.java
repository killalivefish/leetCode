package leetcode.easy;

//TODO user self indexOf method
public class StrStr {
    public int strStr(String haystack, String needle) {
        if(haystack.isEmpty() && needle.isEmpty()){
            return 0;
        }
        if(!haystack.contains(needle)){
            return -1;
        }

        return haystack.indexOf(needle);
    }
}
