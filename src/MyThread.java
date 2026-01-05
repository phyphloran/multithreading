package src;


public class MyThread extends Thread {

    private final Counter counter;

    private final int threadNum;

    public MyThread(Counter counter, int threadNum) {
        this.counter = counter;
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        for (int i = 0; i < CONST.CONST1; i++) {
            counter.increment();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
