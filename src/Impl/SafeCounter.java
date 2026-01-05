package src.Impl;


import src.Counter;

import java.util.concurrent.atomic.AtomicInteger;


public class SafeCounter implements Counter {

    private final AtomicInteger counter;


    public SafeCounter() {
        this.counter = new AtomicInteger(0);
    }

    @Override
    public void increment() {
        counter.incrementAndGet();
    }

    @Override
    public int get() {
        return counter.get();
    }

}
