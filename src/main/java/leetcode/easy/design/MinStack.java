package leetcode.easy.design;

import java.util.ArrayList;
import java.util.List;

//todo 使用队列 easy
public class MinStack {
    List<Integer> data;
    Integer min;
    Integer minIndex;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        data = new ArrayList<>();
    }

    public void push(int val) {
        data.add(val);
        if (min == null) {
            min = val;
        } else {
            if (val < min) {
                min = val;
                minIndex = data.size() - 1;
            }
        }
    }

    public void pop() {
        if (data != null && !data.isEmpty()) {
            int size = data.size();
            data.remove(size - 1);
            if (data.size() > 0) {
                min = null;
                for (int i = 0; i < data.size(); i++) {
                    if(min == null) {
                        min = data.get(i);
                    }else{
                        if (data.get(i) < min) {
                            min = data.get(i);
                            minIndex = i;
                        }
                    }
                }
            }
        }
    }

    public int top() {
        return data.get(data.size() - 1);
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
