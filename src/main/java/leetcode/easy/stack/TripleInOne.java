package leetcode.easy.stack;

import java.util.Arrays;

//TODO
public class TripleInOne {
    int[] data;
    int size;
    public TripleInOne(int stackSize) {
        data = new int[stackSize];
        size = stackSize;
    }

    public void push(int stackNum, int value) {
        if(data.length < stackNum -1){
            Arrays.copyOf(data,stackNum);
            size = stackNum;
        }
         data[stackNum-1] =value;
    }

    public int pop(int stackNum) {
        if(size == 0){
            return -1;
        }
        return -1;
    }

    public int peek(int stackNum) {
        if(size == 0){
            return -1;
        }
        return -1;
    }

    public boolean isEmpty(int stackNum) {
        return size>0;
    }
}
