package leetcode.easy;

import java.util.ArrayList;
import java.util.List;
//TODO
public class IsUgly {
    public boolean isUgly(int n) {
        if(n==1){
            return true;
        }
        if(n<=0){
            return false;
        }
        List<Integer> target = new ArrayList<>();
        target.add(2);
        target.add(3);
        target.add(5);
        
        List<Integer> src = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if(n%i == 0 && (i==2 || i==3 ||i ==5)){
                src.add(i);
            }
        }

        return target.containsAll(src);
    }
}
