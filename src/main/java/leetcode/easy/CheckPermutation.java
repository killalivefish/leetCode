package leetcode.easy;

import java.util.Arrays;

public class CheckPermutation {
    public boolean checkPermutation(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        Arrays.sort(chars1);
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars2);

        return (new String(chars1)).equals((new String(chars2)));
    }

    private String sortedStr(String str){
        Character[] characters = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }
        Arrays.sort(characters);
        StringBuilder sb = new StringBuilder();
        for (Character character : characters) {
            sb.append(character);
        }

        return sb.toString();
    }
}
