package org.example;

public class Talkative implements Runnable{
    private int number;

    public Talkative(int number) {
        this.number = number;
    }

    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            System.out.println(number);
        }
    }
}
