package leetcode.easy.design;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

//TODO
public class MyStack {
    Queue<Integer> data;
    Queue<Integer> back;

    /** Initialize your data structure here. */
    public MyStack() {
        data = new LinkedList<>();
        back = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        data.add(x);
//        back.add(data.)
    }

    /** Removes the element on top of the stack and returns that element. */
 /*   public int pop() {
//        data.poll()
    }

    *//** Get the top element. *//*
    public int top() {

    }

    *//** Returns whether the stack is empty. *//*
    public boolean empty() {

    }*/
}
