package leetcode.thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    private AtomicInteger flag = new AtomicInteger(1);
    
    public Foo() {
    
    }
    
    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        
        printFirst.run();
        flag.incrementAndGet();
    }
    
    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        while (flag.get() != 2) {
        
        }
        printSecond.run();
        flag.incrementAndGet();
    }
    
    public void third(Runnable printThird) throws InterruptedException {
        while (flag.get() != 3) {
        
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
