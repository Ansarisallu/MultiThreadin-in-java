package com.thread.synchronized1;

public class Main {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        Runnable r=new Runnable() {
            @Override
            public void run() {
                ba.withdraw(50);
            }
        };
        Thread th1=new Thread(r,"Thread-1");
        Thread th2=new Thread(r,"Thread-2");
        th1.start();
        th2.start();
    }

}
