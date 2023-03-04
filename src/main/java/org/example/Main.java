package org.example;

public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Talkative(1));
        Thread thread2 = new Thread(new Talkative(2));
        Thread thread3 = new Thread(new Talkative(3));
        Thread thread4 = new Thread(new Talkative(4));
        Thread thread5 = new Thread(new Talkative(5));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}