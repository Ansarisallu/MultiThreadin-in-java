package com.thread.demothread;

public class ThreadMethodClass extends Thread {
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.print(i+" ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethodClass th=new ThreadMethodClass();
        th.start();
        th.join();
        Thread.sleep(5000);
        System.out.println("thread ended");

    }
}
