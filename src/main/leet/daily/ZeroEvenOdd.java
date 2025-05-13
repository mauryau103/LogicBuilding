package main.leet.daily;

import java.util.function.IntConsumer;

public class ZeroEvenOdd {
    private int n;
    private int i;
    private boolean flag;

    public ZeroEvenOdd(int n) {
        this.n = n;
        this.i = 1;
        this.flag = true;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized void zero(IntConsumer printNumber) throws InterruptedException {
        while (!flag) {
            wait();
        }
        printNumber.accept(0);
        flag = !flag;
        notifyAll();
    }

    public synchronized void even(IntConsumer printNumber) throws InterruptedException {
        while (i % 2 != 0 && flag) {
            wait();
        }
        printNumber.accept(i);
        flag = !flag;
        i++;
        notifyAll();
    }

    public synchronized void odd(IntConsumer printNumber) throws InterruptedException {
        while (i % 2 == 0) {
            wait();
        }
        printNumber.accept(i);
        flag = !flag;
        i++;
        notifyAll();
    }

    public static void main(String[] args) {
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(3);

    }
}
