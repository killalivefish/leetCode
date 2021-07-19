package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

//TODO
public class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>(numRows);
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<Integer>(i+1);
            for (int i1 = 0; i1 < (i + 1); i1++) {
//                temp.add()
            }
            result.add(temp);
        }

        return result;
    }
}
