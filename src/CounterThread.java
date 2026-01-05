package src;


import java.util.ArrayList;
import java.util.List;


public class CounterThread extends Thread {

    private final Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        List<Thread> threadList = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < CONST.CONST2; i++) {
            Thread thread = new MyThread(counter, i);
            thread.start();
            threadList.add(thread);
        }

        for (Thread thread : threadList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        long endTime = System.currentTimeMillis();

        String resultEmoji = (counter instanceof src.Impl.RaceConditionCounter) ? "❌" : "✅";

        System.out.println("Counter = " + counter.get() +
                ", Execution time = " + (endTime - startTime) +
                " ms. Realization: " + counter.getClass() + " " + resultEmoji);
    }
}
