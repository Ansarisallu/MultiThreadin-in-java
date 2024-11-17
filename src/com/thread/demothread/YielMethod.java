package com.thread.demothread;

public class YielMethod extends Thread {
    public YielMethod(String name){
        super(name);
    }
    @Override
    public void  run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+" is running");
            Thread.yield();
        }
    }
    public static void main(String[] args) {
        YielMethod thread1=new YielMethod("T1");
        YielMethod thread2=new YielMethod("T2");

        thread1.start();
        thread2.start();

    }
}
