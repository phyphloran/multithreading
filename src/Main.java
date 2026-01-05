package src;


import src.Impl.RaceConditionCounter;
import src.Impl.SafeCounter;
import src.Impl.SafeSyncCounter;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Expected value: " + CONST.CONST1 * CONST.CONST2);
        Thread safeThread = new CounterThread(new SafeCounter());
        Thread safeSyncThread = new CounterThread(new SafeSyncCounter());
        Thread raceConditionThread = new CounterThread(new RaceConditionCounter());
        safeThread.start();
        safeSyncThread.start();
        raceConditionThread.start();
    }

}