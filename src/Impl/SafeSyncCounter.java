package src.Impl;


import src.Counter;


public class SafeSyncCounter implements Counter {

    private int counter;

    private final Object object;


    public SafeSyncCounter() {
        this.counter = 0;
        this.object = new Object();
    }


    @Override
    public void increment() {
        synchronized (object) {
            counter++;
        }
    }

    @Override
    public int get() {
        return counter;
    }
}
