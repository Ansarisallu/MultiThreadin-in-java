package com.thread.demothread;

public class ThreadPriority extends Thread {
    public ThreadPriority(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+ "-Priority:"+Thread.currentThread().getPriority()+ "-count:"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadPriority np1=new ThreadPriority("salauddin");
        ThreadPriority np2=new ThreadPriority("monu");
        ThreadPriority np3=new ThreadPriority("kallu");
       np2.setPriority(Thread.MAX_PRIORITY);
       np3.setPriority(Thread.NORM_PRIORITY);
       np1.setPriority(Thread.MIN_PRIORITY);
       np1.start();
   
       np2.start();

       np3.start();

    }
}
