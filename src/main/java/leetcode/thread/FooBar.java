package leetcode.thread;

import java.util.concurrent.atomic.AtomicInteger;

//TODO timeout
public class FooBar {
    
    private int n;
    private AtomicInteger atomicInteger = new AtomicInteger(1);
    
    public FooBar(int n) {
        this.n = n;
    }
    
    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            while(atomicInteger.get()%2==0){
        
            }
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                atomicInteger.incrementAndGet();
        }
    }
    
    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            while(atomicInteger.get()%2==1){
        
            }
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                atomicInteger.incrementAndGet();
        }
    }
    
    private static class RunThreadFoo extends Thread{
        FooBar fooBar;
        
        public RunThreadFoo(FooBar fooBar) {
            this.fooBar = fooBar;
        }
        @Override
        public void run(){
            try {
                this.fooBar.foo(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("foo");
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    
    private static class RunThreadBar extends Thread{
        FooBar fooBar;
        
        public RunThreadBar(FooBar fooBar) {
            this.fooBar = fooBar;
        }
        @Override
        public void run(){
            try {
                this.fooBar.bar(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("bar");
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    
    public static void main(String[] args) {
        int n =1000;
        FooBar fooBar = new FooBar(n);
        RunThreadFoo foo= new RunThreadFoo(fooBar);
        RunThreadBar bar= new RunThreadBar(fooBar);
        foo.start();
        bar.start();
    }
}
