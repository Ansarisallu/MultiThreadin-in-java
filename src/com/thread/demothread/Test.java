package com.thread.demothread;

public class Test extends Thread{
    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            System.out.println("test");
        }
    }
}
