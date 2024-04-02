package leetcode.easy;

import java.util.LinkedList;
import java.util.Stack;

//TODO
public class DistinctIntegers {
    public int distinctIntegers(int n) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(n);
        while(!myStack.isEmpty()){
            Integer temp = myStack.pop();
            for (int i = 0; i < n; i++) {
                if(temp%i==1){
                    myStack.push(i);
                }
            }
        }

        return 0;
    }
}
