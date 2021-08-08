package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Tribonacci {
    public int tribonacci(int n) {
        if(n==0){
          return 0;
        }
        if(n==1){
            return 0;
        }
        if(n==2){
            return 0;
        }
        int[] numArray = new int[n + 1];
        numArray[0] = 0;
        numArray[1] = 1;
        numArray[2] = 1;
        if (n >= 3) {
            for (int i = 3; i <= n; i++) {
                numArray[i] = numArray[i - 1] + numArray[i - 2] + numArray[i - 3];
            }
        }
        return numArray[n];
    }
}
