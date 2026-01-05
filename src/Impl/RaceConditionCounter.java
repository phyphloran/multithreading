package src.Impl;


import src.Counter;


public class RaceConditionCounter implements Counter {

    private int counter;


    public RaceConditionCounter() {
        this.counter = 0;
    }

    @Override
    public void increment() {
        counter++;
    }

    @Override
    public int get() {
        return counter;
    }

}
