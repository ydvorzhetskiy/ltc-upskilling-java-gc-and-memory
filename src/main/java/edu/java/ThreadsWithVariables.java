package edu.java;

public class ThreadsWithVariables implements Runnable {

    private static int counter;
//    private static ThreadLocal<Integer> counter = new ThreadLocal<Integer>() {
//        @Override
//        protected Integer initialValue() {
//            return 0;
//        }
//    };

    @Override
    public void run() {
        for (int i = 0; i < 100; ++i) {
            synchronized (ThreadsWithVariables.class) {
                counter++;
                //counter.set(counter.get() + 1);


                System.out.println(counter);
                //System.out.println(counter.get());
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; ++i) {
            new Thread(new ThreadsWithVariables()).start();
        }
        Thread.sleep(4000);
    }
}
