package com.thread.demothread;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("my thread");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread m=new MyThread();
        System.out.println(m.getState());
        m.start();
        System.out.println(m.getState());
//        String name = Thread.currentThread().getName();
//        System.out.println(name);
        Thread.sleep(100);
        State state = m.getState();
        System.out.println(state);
        m.join();

        System.out.println(m.getState());


    }
}
