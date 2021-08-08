package leetcode.easy.stack;

import java.util.*;

public class MinStack {
    LinkedList<Integer> data;
    int min;
    /** initialize your data structure here. */
    public MinStack() {
        data = new LinkedList<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        data.add(x);
        min = Math.min(min,x);
    }

    public void pop() {
        data.removeLast();
        if(data.isEmpty()){
            min = Integer.MAX_VALUE;
        }else{
            List<Integer> temp = new ArrayList<>();
            Collections.copy(temp,data);
            Collections.sort(temp);
            min = temp.get(0);
        }
    }

    public int top() {
        return data.get(data.size()-1);
    }

    public int min() {
        return min;
    }
}
