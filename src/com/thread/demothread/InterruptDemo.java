package com.thread.demothread;

public class InterruptDemo extends Thread {
    public InterruptDemo(String name){
        super(name);
    }
    @Override
    public void run() {
        try{
            Thread.sleep(2000);
            System.out.println("Thread is running :" +Thread.currentThread().getName());
        }catch (InterruptedException e){
            System.out.println("Interrupt exception"+e);
        }
    }

    public static void main(String[] args) {
        InterruptDemo ne=new InterruptDemo("sallu");
        ne.start();
        ne.interrupt();


    }
}
