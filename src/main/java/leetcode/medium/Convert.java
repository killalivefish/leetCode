package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Convert {
    public String convert(String s, int numRows) {
        if(s.length() == numRows){
            return s;
        }

        int ge = numRows - 2;
        int size = 2 * numRows - 2;

//        4 1 1 4 1 1 4 1 1 3
        List<List<String>> result = new ArrayList<List<String>>();
        for (int i = 0; i < s.length(); i++) {
            for (int i1 = 0; i1 < numRows; i1++) {
                List<String> temp1 = new ArrayList<String>(numRows);
                for (int i2 = 0; i2 < numRows; i2++) {
                    if(i == s.length()){
                        break;
                    }
                    char c = s.charAt(i);
                    temp1.add(c + "");
                    i++;
                }
                result.add(temp1);
            }

            for (int i1 = 1; i1 <= ge; i1++) {
                List<String> temp2 = new ArrayList<String>(numRows);
                for (int i2 = 0; i2 < numRows; i2++) {
                    if(i == s.length()){
                        break;
                    }
                    char c = s.charAt(i);
                    if (i2 == numRows - i1 - 1) {
                        temp2.add(c + "");
                    } else {
                        temp2.add("");
                    }
                    i++;
                }
                result.add(temp2);
                i1++;
            }
        }


        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < numRows; i++) {
            for (List<String> strings : result) {
                /*String s1 = strings.get(i);
                if (s1 != null && s1 != "") {
                    sb.append(s1);
                }*/
                for (String string : strings) {
                    System.out.print(string);
                }
                System.out.println();
            }
//        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Convert convert = new Convert();
        System.out.println(convert.convert("PAYPALISHIRING", 3));
//        System.out.println(convert.convert("PAYPALISHIRING", 4));
    }
}
