package leetcode.medium;

import java.util.*;

public class ReverseWords {
    public String reverseWords(String s) {

        StringBuffer sb = new StringBuffer();
        String[] wordArray = s.split(" ");
        for (int i = wordArray.length - 1; i >= 0; i--) {
            if (wordArray[i]==" ") {
                continue;
            }
            sb.append(wordArray[i]);
            if(i!=0){
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
