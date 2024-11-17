package com.thread.demothread;

public class SetDeoman extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("Thread runinng");
        }

    }
    public static void main(String[] args) {
        SetDeoman thread=new SetDeoman();
        SetDeoman thread1=new SetDeoman();
        thread.setDaemon(true);
        thread.start();
        thread1.start();
        System.out.println("main end");

    }
}
